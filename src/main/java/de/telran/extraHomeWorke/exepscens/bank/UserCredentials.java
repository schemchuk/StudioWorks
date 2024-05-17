package de.telran.extraHomeWorke.exepscens.bank;

import java.util.List;

public class UserCredentials {
    private List<Role> roles;

    public boolean hasRole(Role role) {
        return roles.contains(role);
    }


    public List<Role> getRoles() {
        return roles;
    }
}
