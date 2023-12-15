/*
Name: Narmeen Khalid
COSC1200 OBJECT-ORIENTED PROGRAMMING
Assignment4: Inheritance
December 7th, 2023
Description: Create a simple Java console app that keeps records of products and displays stored data
 */

package Assignment4;

public class Products {

    // Declaring the variables
    private int sku;
    private String nameOfProduct;
    private double unitCost;
    private int totalOnHand;
    private int totalToOrder;
    private String specialInstructions;

    // Default constructor
    public Products() {
        this.sku = 0;
        this.nameOfProduct = "Cookie";
        this.unitCost = 0.0;
        this.totalOnHand = 0;
        this.totalToOrder = 0;
        this.specialInstructions = "None";
    }

    // Parameterized constructor
    public Products(int sku, String nameOfProduct, double unitCost,
                    int totalOnHand, int totalToOrder, String specialInstructions) {
        this.sku = sku;
        this.nameOfProduct = nameOfProduct;
        this.unitCost = unitCost;
        this.totalOnHand = totalOnHand;
        this.totalToOrder = totalToOrder;
        this.specialInstructions = specialInstructions;
    }

    // Setters for all data members

    /**
     * Sets a value for the SKU
     * @param sku sku for product
     */
    public final void setSku(int sku) {
        if (sku > 0) {
            this.sku = sku;
        } else {
            throw new IllegalArgumentException("Error: SKU cannot be a negative value!");
        }
    }

    /**
     * Sets the name of a product
     * @param nameOfProduct name of the product
     */
    public final void setNameOfProduct(String nameOfProduct) {
        if (nameOfProduct != null) {
            this.nameOfProduct = nameOfProduct;
        } else {
            throw new IllegalArgumentException("Error: Cannot leave Name of Product blank!");
        }
    }

    /**
     * Sets the unit cost for a product and makes sure that is not less than 0
     * @param unitCost unit cost of product
     */
    public final void setUnitCost(int unitCost) {
        if (unitCost > 0) {
            this.unitCost = unitCost;
        } else {
            throw new IllegalArgumentException("Error: Unit cost has to be greater than 0");
        }
    }

    /**
     * Sets the total quantity of a product on hand
     * @param totalOnHand total on hand for the product
     */
    public final void setTotalOnHand(int totalOnHand) {
        if (totalOnHand >= 0) {
            this.totalOnHand = totalOnHand;
        } else {
            throw new IllegalArgumentException("Error: Total on Hand cannot be a negative value.");
        }
    }

    /**
     * Sets the total quantity of a product that has to be ordered
     * @param totalToOrder total to order for the product
     */
    public final void setTotalToOrder(int totalToOrder) {
        if (totalToOrder >= 0) {
            this.totalToOrder = totalToOrder;
        } else {
            throw new IllegalArgumentException("Error: Total to Order cannot be a negative value.");
        }
    }

    /**
     * Sets a message for any special instructions related to the product
     * @param specialInstructions special instructions for the products
     */
    public final void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    // Getters for all data members

    /**
     * Gets the SKU for a product
     * @param sku sku for product
     * @return sku - int
     */
    public final int getSku(int sku) {
        return sku;
    }

    /**
     * Gets the name of a product
     * @param nameOfProduct name of the product
     * @return name of product - String
     */
    public final String getNameOfProduct(String nameOfProduct) {
        return nameOfProduct;
    }

    /**
     * Gets the unit cost for a product
     * @param unitCost unit cost of product
     * @return unit cost - int
     */
    public final double getUnitCost(double unitCost) {
            return unitCost;
    }

    /**
     * Gets the total quantity on hand for a product
     * @param totalOnHand total on hand for the product
     * @return total on hand - int
     */
    public final int getTotalOnHand(int totalOnHand) {
        return totalOnHand;
    }

    /**
     * Gets the total quantity to order for a product
     * @param totalToOrder total to order for the product
     * @return total to order - int
     */
    public final int getTotalToOrder(int totalToOrder) {
        return totalToOrder;
    }

    /**
     * Gets the special instructions for a product
     * @param specialInstructions special instructions for the products
     * @return special instructions - String
     */
    public final String getSpecialInstructions(String specialInstructions) {
        return specialInstructions;
    }

    // Display function

    /**
     * Function to display the products and their stored information
     */
    public void display() {
        System.out.println("SKU: " + sku);
        System.out.println("Product name: " + nameOfProduct);
        System.out.println("Unit Cost: " + unitCost);
        System.out.println("Quantity on hand: " + totalOnHand);
        System.out.println("Quantity to order: " + totalToOrder);
        System.out.println("Special Instructions: " + specialInstructions);
    }
}
