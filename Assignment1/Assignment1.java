/***************************
 * Name: Narmeen Khalid
 * Course: COSC 1200
 * Date: September 29, 2023
 * Description: Assignment 1: Assignment1.java
 ****************************/

package Assignment1;

import java.util.Scanner;

public class Assignment1 {
    public static final double CONSTANT_GRAVITY = 9.8;
    public static void main(String[] args) {
        //Prompt user to enter the initial angle
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the initial angle of the projectile" +
                " in degrees: ");
        //Convert user input to double and adding Math.abs to convert any negative values to absolute values
        //Convert degrees to radians
        double initial_angle_degrees = Math.abs(input.nextDouble());
        double initial_angle_radians = Math.toRadians(initial_angle_degrees);


        //Prompt user to enter the initial velocity
        Scanner input_2 = new Scanner(System.in);
        System.out.println("Please enter the initial velocity of the " +
                "projectile (m/s): ");
        String initial_velocity_user = input_2.nextLine();
        //Convert user input to double and adding Math.abs to convert any negative values to absolute values
        double initial_velocity = Math.abs(Double.parseDouble(initial_velocity_user));


        //Calculate the maximum horizontal distance of the projectile
        double max_horizontal_distance = (initial_velocity * initial_velocity * Math.sin(2 * initial_angle_radians))/
                CONSTANT_GRAVITY;

        //Format to display an output value to three decimal points
        String final_horizontal_distance = String.format("%.3f", max_horizontal_distance);

        //Display the result to the user
        System.out.println("The maximum horizontal distance covered by the projectile is " + final_horizontal_distance
                + " in meters");


    }
}
