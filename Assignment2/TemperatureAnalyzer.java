/***************************
 * Name: Narmeen Khalid
 * Course: COSC 1200
 * Date: October 21st, 2023
 * Description: Assignment 2: TemperatureAnalyzer.java
 ****************************/

package Assignment2;

import java.util.Scanner;

public class TemperatureAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Get the number of days from the user
        int numofDays = 0;
        while (numofDays < 1 || numofDays > 31) {
            System.out.print("Please enter the number of days (1-31): ");
            numofDays = scanner.nextInt();
        }
        //Arrays for storing the high and low temps
        double[] lowTemp = new double[numofDays];
        double[] highTemp = new double[numofDays];
        //Other variables for calculations
        double overallAvg = 0.0;
        double lowestTemp = 30.0;
        double highestTemp = -30.0;
        //Get user input for the low and high temps for each day
        for (int day = 0; day < numofDays; day++) {
            double low, high;
            do {
                System.out.print("Please enter low temperature for day " + (day + 1) + "(-30 to 30): ");
                low = scanner.nextDouble();
                System.out.print("Please enter high temperature for day " + (day + 1) + "(-30 to 30): ");
                high = scanner.nextDouble();

                if (low > high) {
                    System.out.println("Error: Invalid input. Please make sure the low temperature is lower " +
                            "than the high temperature.");
                }
                if (low < -30 || high > 30) {
                    System.out.println("Error: Invalid input. Please make sure that your input is within the range " +
                            "of -30 to 30.");
                }
            } while (low < -30 || high > 30 || low > high);
                lowTemp[day] = low;
                highTemp[day] = high;
                //Calculate the daily average
                double dayAvg = (low + high) / 2.0;
                //Add it to the overall average
                overallAvg += dayAvg;
                //Update the lowest and highest temps according to the user input
                if (low < lowestTemp) {
                    lowestTemp = low;
                }
                if (high > highestTemp) {
                    highestTemp = high;
                }
                //Display the average temp for the day before moving on to the next day
                System.out.println("Average temperature for day " + (day + 1) + ": " +
                        String.format("%.1f", dayAvg));
            //Calculate the overall average and display the values to the user
            overallAvg /= numofDays;
            System.out.println("The overall average temperature: " + String.format("%.1f", overallAvg));
            System.out.println("The day with the lowest temperature: " + (getDay(lowTemp, lowestTemp) + 1));
            System.out.println("The day with the highest temperature: " + (getDay(highTemp, highestTemp) + 1));
        }
        //Close the scanner
        scanner.close();
    }
    /***
     * Helps find the day with the lowest and highest temperatures
     * @param temperatures An array of temperatures
     * @param temp The specific temperature (low or high) that we want to find
     * @return The day that had the lowest and the day that had the highest temperature
     */
    public static int getDay(double[] temperatures, double temp) {
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] == temp) {
                return i;
            }
        }
        //Return 0 in case there is no matching element in the array
        return 0;
    }
}