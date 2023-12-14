/*
Name: Narmeen Khalid
COSC1200 OBJECT-ORIENTED PROGRAMMING
Assignment4: Inheritance
December 7th, 2023
Description: Driver for both Products and PerishableProducts to display the stored
             information and test the application.
 */

package Assignment4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductDriver {

    public static void main(String[] args) {

        // Creating a list to store the new products
        List<Products> productsList = new ArrayList<>();

        // Adding products
        try {
            Products product1 = new Products(1001, " ", 369.99, 5,
                    10, "Handle with care");
            productsList.add(product1);
            Products product2 = new Products(1002, "Ear Buds", 149.99,
                    20, 10, "Store in a cool and dry place");
            productsList.add(product2);
            Products product3 = new Products(1003, "Charging Cable", 19.99,
                    50, 40, "Sold in pack of 2");
            productsList.add(product3);
            // Adding perishable products
            PerishableProducts PP1 = new PerishableProducts(1004, "Ice-Cream", 8.99, 30,
                    8, "Keep Frozen", new Date());
            productsList.add(PP1);
            PerishableProducts PP2 = new PerishableProducts(1005, "Beef Jerky", 7.99, 40,
                    35, "Store in a cool and dry place", new Date());
            productsList.add(PP2);

        } catch (IllegalArgumentException e) {
            System.out.println("Message: " + e.getMessage());
        }
        // Display details of all products
        for (Products products : productsList) {
            System.out.println("---------------------------------------");
            products.display();
            System.out.println("---------------------------------------");
        }
    }
}
