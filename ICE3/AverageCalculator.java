//Narmeen Khalid
//COSC1200 - Object-Oriented Programming 1
//November 18th, 2023
//Description - Create a program that calculates the average of the user input
//              while adding some exceptions using try and catch
package ICE3;

import java.util.Scanner;
import java.util.InputMismatchException;
public class AverageCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numofValues = getnumofValues(scanner);
        int sum = getValuesandCalculateSum(scanner, numofValues);
        double average = calculateAverage(sum, numofValues);
        System.out.println("The average is: " + average);
        scanner.close();
    }

    /**
     * Function to get user input regarding the number of values to be entered
     * @param scanner
     * @return The number of values the user wants to enter
     */
    private static int getnumofValues(Scanner scanner) {
        int numofValues = 0;
        
        while (true) {
            try {
                System.out.println("How many values do you want to enter: ");
                numofValues = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid numeric value.");
                scanner.nextLine();
            }
        }
        return numofValues;
    }

    /**
     * Function to get the values from the user and calculate the sum
     * @param scanner
     * @param numofValues
     * @return The sum of the values entered by the user
     */
    private static int getValuesandCalculateSum(Scanner scanner, int numofValues) {
        int sum = 0;
        
        for (int i = 1; i <= numofValues; i++) {
            int value = getValidValue(scanner, i);
            sum += value;
        }
        return sum;
    }

    /**
     * Function to get and validate the values from the user
     * @param scanner
     * @param index
     * @return The values inputted by the user
     */
    private static int getValidValue(Scanner scanner, int index) {
        int value = 0;

        while (true) {
            try {
                System.out.println("Enter value #" + index + ": ");
                value = scanner.nextInt();
                if (value >= 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive value.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid numeric value.");
                scanner.nextLine();
            }
        }
        return value;
    }

    /**
     * Function to calculate the average
     * @param sum
     * @param numofValues
     * @return The average of the values
     */
    private static double calculateAverage(int sum, int numofValues) {
        return (double) sum / numofValues;
    }
    
}
