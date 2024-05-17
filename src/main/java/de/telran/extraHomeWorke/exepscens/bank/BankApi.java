package de.telran.extraHomeWorke.exepscens.bank;

import java.util.Optional;

public interface BankApi {
    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws UnauthorizedAccessException, AccessDeniedException;
}
