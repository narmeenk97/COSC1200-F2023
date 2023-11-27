/*
Narmeen Khalid
COSC1200 - Object-Oriented Programming
November 24, 2023
Description: Assignment 3 VaccineApp.java
 */

package Assignment3;

import java.util.Calendar;
import java.util.Date;

public class VaccineApp {

    public static void main(String[] args) {
        Vaccine emptyVaccine = new Vaccine();

        // Display the empty Vaccine details
        System.out.println("Empty Vaccine Details:");
        emptyVaccine.display(false);

        // Use setters to add values to the empty Vaccine
        emptyVaccine.setVaccineID(1);
        emptyVaccine.setVaccineName("Moderna");
        emptyVaccine.setUnitCost(29.99);
        emptyVaccine.setAvailableUnits(1000);
        // December 31, 2023
        emptyVaccine.setExpiryDate(new Date(2023 - 1900, Calendar.DECEMBER, 31));

        // Display updated values in non-linear format
        System.out.println("\nUpdated Vaccine Details:");
        emptyVaccine.display(false);

        // Use constructor to create more vaccines
        Vaccine vaccine1 = new Vaccine(2, "Johnson&Johnson", 20.0, 500,
                new Date(2023 - 1900, 10, 15)); // November 15, 2023
        Vaccine vaccine2 = new Vaccine(3, "Pfizer", 40.75, 650,
                new Date(2026 - 1900, 2, 28)); // March 28, 2026
        Vaccine vaccine3 = new Vaccine(4, "Novavax", 25.0, 184,
                new Date(2025 - 1900, 8, 12)); // September 12, 2025

        // Array for all the Vaccines
        Vaccine[] vaccines = {emptyVaccine, vaccine1, vaccine2, vaccine3};

        // Display details for all vaccines in a table format
        System.out.println("\nDetails for all Vaccines:");
        System.out.printf("%-4s | %-15s | %-10s | %-4s | %s%n",
                "SKU", "Vaccine Name", "Unit Cost", "QTY", "Expiry");
        System.out.println("----|-----------------|------------|-----|------------");

        for (Vaccine vaccine : vaccines) {
            vaccine.display(true);
        }


    }
}
