package de.telran._JavaProStudio.module5.lesson1;

public class RegistrationValidator {
    public static void main(String[] args) {
        try {
            boolean result = validateRegistration("user123", "password123", "password123");
            System.out.println("Registration is valid: " + result);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }
    }

    public static boolean validateRegistration(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        try {
            validateLogin(login);
            validatePassword(password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            throw e;
        }
    }

    private static void validateLogin(String login) throws WrongLoginException {
        if (!login.matches("[A-Za-z0-9_]+") || login.length() >= 20) {
            throw new WrongLoginException("Invalid login");
        }
    }

    private static void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (!password.matches("[A-Za-z0-9_]+") || password.length() >= 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Invalid password");
        }
    }
}

class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Wrong login");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Wrong password");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}

