package week10.week10_1;

import java.util.Scanner;

public class UserRegistration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to User Registration!");

        try {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            validateUsername(username);

            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            validatePassword(password);

            System.out.print("Confirm password: ");
            String confirmPassword = scanner.nextLine();
            validatePasswordConfirmation(password, confirmPassword);

            System.out.println("Registration successful!");
        } catch (InvalidUsernameException | InvalidPasswordException ex) {
            System.out.println("Registration failed: " + ex.getMessage());
        }finally{
            scanner.close();
        }
    }

    static void validateUsername(String username) throws InvalidUsernameException {
        // Include logic for username validation
        if (username == null || username.length() < 6 || username.length() > 20 || !username.matches("\\w+")){
            throw new InvalidUsernameException("Username must be 6-20 characters and " +
                    "contain only letters, numbers, and underscores");
        }
    }

    static void validatePassword(String password) throws InvalidPasswordException {
        // Include logic for password validation
        if(password == null || password.length() < 8 ||
        !password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")){
            throw new InvalidPasswordException("Password must be at least 8 characters and " +
                    "include an uppercase letter, a number, and a special character.");
        }
    }

    static void validatePasswordConfirmation(String password, String passwordConfirmation)
            throws InvalidPasswordException {
        // Include logic for password validation
        if(!password.equals(passwordConfirmation)) {
            throw new InvalidPasswordException("Password and Password confirmation do not match!.");
        }
    }
}

class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}
