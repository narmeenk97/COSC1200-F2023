/***************************
 * Name: Narmeen Khalid
 * Course: COSC 1200
 * Date: September 21, 2023
 * Description: ICE #1: WelcomeDriver.java
 ***************************/
package ICE1;

import java.util.Scanner;

public class WelcomeDriver{

    public static void main(String[] args){

        //welcome message
        System.out.println("Welcome to COSC 1200 - ICE 1");
        System.out.println("My favourite quote is: Fear doesnt have to make you cruel or cowardly, fear can make you kind.");
        System.out.println("- The Doctor");

        //numeric input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in a number between (50 to 999): ");
        String strValue = input.nextLine();

        //convert string to double
        double numValue = Double.parseDouble(strValue);

        if (50 <= numValue && numValue <= 999) {
            System.out.println("The number you entered is..." + numValue + " and it is within the acceptable boundaries");

        } else {

            System.out.println("Alert, the number you entered is..." + numValue + " and it is NOT within the acceptable" +
                    "boundaries of (50 and 999");
        }



    }
}