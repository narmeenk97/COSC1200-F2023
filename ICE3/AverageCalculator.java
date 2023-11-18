//Narmeen Khalid
//COSC1200 - Object-Oriented Programming 1
//November 18th, 2023
//Description - Create a program that calculates the average of the user input
//              while adding some exceptions using try and catch
package ICE3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AverageCalculator {

    private static class NonNumericInputException extends Exception {
        public NonNumericInputException(String message) {
            super(message);
        }
    }

    private static class NegativeInputException extends Exception {
        public NegativeInputException(String message) {
            super(message);
        }
    }

    private static class IntegerTooBigException extends Exception {
        public IntegerTooBigException(String message) {
            super(message);
        }
    }

    private static int validateInput(Scanner scanner, String prompt) throws NonNumericInputException,
            NegativeInputException {
        try {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input > 0) {
                    if (input <= Integer.MAX_VALUE) {
                        return input;
                    } else {
                        throw new IntegerTooBigException("Please enter a smaller value.");
                    }
                } else {
                    throw new NegativeInputException("Please enter a positive value.");
                }
            } else {
                throw new NonNumericInputException("Please enter a valid numeric value.");
            }
        } catch (java.util.InputMismatchException e) {
            throw new NonNumericInputException("Please enter a valid numeric value.");
        } catch (IntegerTooBigException e) {
            throw new RuntimeException(e);
        } finally {
            scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of values
        int numbOfValues = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                numbOfValues = validateInput(scanner, "How many values do you want to enter: ");
                validInput = true;
            } catch (NegativeInputException | NonNumericInputException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Prompt the user to enter each value and calculate the average
        int sum = 0;

        for (int i = 0; i < numbOfValues; i++) {
            boolean validValue = false;

            while (!validValue) {
                try {
                    int value = validateInput(scanner, "Enter value " + (i + 1) + ": ");
                        sum += value;
                        validValue = true;
                } catch (NegativeInputException | NonNumericInputException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }

        // Calculate and display the average
        double average = (double) sum / numbOfValues;
        System.out.println("The average is: " + average);

        scanner.close();
    }
}
