/*
Name: Narmeen Khalid
COSC1200 OBJECT-ORIENTED PROGRAMMING
Assignment4: Inheritance
December 7th, 2023
Description: Create a Java console app that extends the Products class to include any perishable products and
             overrides the display function to include the relevant information.
 */

package Assignment4;

import java.util.Date;

public class PerishableProducts extends Products {

    // Declaring variables
    private Date expiryDate;


    // Overloaded constructor
    public PerishableProducts(int sku, String nameOfProduct, double unitCost,
                              int totalOnHand, int totalToOrder, String specialInstructions, Date expiryDate) {
        super(sku, nameOfProduct, unitCost, totalOnHand, totalToOrder, specialInstructions);
        this.expiryDate = expiryDate;
    }

    // Setter

    /**
     * Sets the expiry date for a product and performs validation checks
     */
    public void setExpiryDate(Date expiryDate) {
        // Check to see whether the expiry date is blank and in the future
        if (expiryDate != null && expiryDate.after(new Date())) {
            this.expiryDate = expiryDate;
        } else {
            throw new IllegalArgumentException("Error: Please enter a valid Expiry Date!");
        }
    }

    // Getter

    /**
     * Gets the expiry date for a product
     * @return expiry date - Date
     */
    public Date getExpiryDate(Date expiryDate) {
        return expiryDate;
    }

    // Overridden display function

    /**
     * Overridden display function from the Products class, now also displays +
     * expiry date for relevant products.
     */
    @Override
    public void display() {
        super.display();
        System.out.println("Expiry Date: " + expiryDate);
    }

}
