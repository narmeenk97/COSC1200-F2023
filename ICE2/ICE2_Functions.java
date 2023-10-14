/***************************
 * Name: Narmeen Khalid
 * Course: COSC 1200
 * Date: October 12th, 2023
 * Description: ICE2_Functions.java
 ***************************/
package ICE2;

public class ICE2_Functions {
    /**
     * Returns nothing, prints stars equal to the value of its parameter
     * @param numofStars The number of stars to be printed
     */
    public static void drawStars(int numofStars) {
        for (int i = 0; i < numofStars; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    /**
     * Returns nothing, prints the string statement inputted
     * @param str The string to be printed
     * @return Does not return anything
     */
    public static void printStatement(String str){
        System.out.println(str);
    }
    /**
     * Returns the product of two integer numbers
     * @param num1 First integer number
     * @param num2 Second integer number
     * @return The product of num1 and num2
     */
    public static int multiplyNumbers(int num1, int num2){
        return num1 * num2;
    }
    /**
     * Returns the product of two double numbers
     * @param num1 First double number
     * @param num2 Second double number
     * @return The product of num1 and num2
     */
    public static double multiplyNumbers(double num1, double num2){
        return num1 * num2;
    }
    /**
     * Returns a True or False answer to whether a string is a palindrome
     * @param string The string to be checked
     * @return If the string is a palindrome return True and if not then return False
     */
    public static boolean isPalindrome(String string){
        // Convert the string to lower case and remove non-alphabetic characters
        string = string.toLowerCase().replaceAll("[^a-z]", "");
        // If the string is empty or has just one character then return true
        // Base case
        if (string.isEmpty() || string.length() == 1)
            return true;
        // Check whether the first and last characters of the string are the same
        // Recursive case
        if (string.charAt(0) == string.charAt(string.length()-1))
            return isPalindrome(string.substring(1, string.length()-1));
        return false;
    }
    public static void main(String[] args){

        int numofStars1 = 15;
        drawStars(numofStars1); //***************

        String str1 = "ICE2: Function Practice Start";
        printStatement(str1); // ICE2: Function Practice Start

        int test1 = multiplyNumbers(6, 8);
        double test2 = multiplyNumbers(7.8, 8.9);
        System.out.println("Result (integer): " + test1); // 48
        System.out.println("Result (double): " + test2); // 69.42

        String str2 = "ICE2: Functions Practice End";
        printStatement(str2); // ICE2: Functions Practice End

        int numofStars2 = 15;
        drawStars(numofStars2); //***************

        String string1 = "civic";
        System.out.println("Is " + string1 + " a palindrome? " + isPalindrome(string1)); // true

        String string2 = "COSC1200";
        System.out.println("Is " + string2 + " a palindrome? " + isPalindrome(string2)); // false
    }





}
