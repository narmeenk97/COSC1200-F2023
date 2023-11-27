/*
Narmeen Khalid
COSC1200 - Object-Oriented Programming
November 24, 2023
Description: Assignment 3 Vaccine.java
 */

package Assignment3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Vaccine {
    private int vaccineID;
    private String vaccineName;
    private double unitCost;
    private int availableUnits;
    private Date expiryDate;

    // Default constructor with meaningful values
    public Vaccine() {
        this.vaccineID = 0;
        this.vaccineName = "Unknown";
        this.unitCost = 0.0;
        this.availableUnits = 0;
        this.expiryDate = new Date();
    }

    // Parameterized constructor
    public Vaccine(int vaccineID, String vaccineName, double unitCost, int availableUnits, Date expiryDate) {
        this.vaccineID = vaccineID;
        this.vaccineName = vaccineName;
        this.unitCost = unitCost;
        this.availableUnits = availableUnits;
        this.expiryDate = expiryDate;
    }

    // Setters
    public void setVaccineID(int vaccineID) {
        this.vaccineID = vaccineID;
    }
    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }
    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }
    public void setAvailableUnits(int availableUnits) {
        this.availableUnits = availableUnits;
    }
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    // Getters
    public int getVaccineID() {
        return vaccineID;
    }
    public String getVaccineName() {
        return vaccineName;
    }
    public double getUnitCost() {
        return unitCost;
    }
    public int getAvailableUnits() {
        return availableUnits;
    }
    public Date getExpiryDate() {
        return expiryDate;
    }

    // Display function
    public void display(boolean True) {
        if (True) {
            System.out.printf("%-4d | %-15s | %-10.2f | %-4d | %tF%n",
                    vaccineID, vaccineName, unitCost, availableUnits, expiryDate);
        } else {
            System.out.println("SKU: " + vaccineID);
            System.out.println("Vaccine Name: " + vaccineName);
            System.out.println("Unit Cost: $" + unitCost);
            System.out.println("Quantity on hand: " + availableUnits);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println("Expiry Date: " + dateFormat.format(expiryDate));
        }
    }

}
