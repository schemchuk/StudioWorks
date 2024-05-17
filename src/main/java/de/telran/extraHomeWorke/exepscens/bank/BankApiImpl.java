package de.telran.extraHomeWorke.exepscens.bank;

import java.util.List;
import java.util.Optional;

public class BankApiImpl implements BankApi {
    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException {
       reguireSearchClientRole(credentials);

        for (BankClient client : clients) {
            if (client.getUid().equals(uid)) {
                return Optional.of(client);
            }
        }
        return Optional.empty();
    }

    private void reguireSearchClientRole(UserCredentials credentials) throws AccessDeniedException {
        if (!credentials.getRoles().contains(Role.CAN_SEARCH_CLIENTS)) {
            throw new AccessDeniedException("Access denied. User does not have the required role to search clients.");
        }
    }
}


