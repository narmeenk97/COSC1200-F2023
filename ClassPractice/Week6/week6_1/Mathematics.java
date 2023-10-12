package ClassPractice.Week6.week6_1;

public class Mathematics {


    /**+enter to get this - use this for methods in assignments\ICE's
     * Return the square of a given integer.
     * @param num The integer to be squared
     * @return The square of the given integer.
     */
    public int square(int num){
        //return Math.pow(num, 2);
        return num * num;
    }

    /**
     * Returns the square of a given double.
     * @param num The double value to be squared
     * @return The square of the given double.
     */
    public double square(double num){
        return num * num;
    }

    /**
     * Raises a double value to a given exponent.
     * @param base The base value.
     * @param exponent The exponent to which the base should be raised.
     * @return The result of raising the base to the given exponent.
     */
    public double power(double base, int exponent){
        double result = 1;
        for(int i = 0; i < exponent; i++){
            result *= base;
        }
        return result;
    }

    public static String reverseString(String str){
        // Base case
        if ((null == str) || (str.length() <= 1)){
            return str;
        }
        // Recursive case
        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }

    public static void main(String[] args){

        Mathematics math = new Mathematics();

        System.out.println("Square of 5 (int): " + math.square(5)); // 25
        System.out.println("Square of 5.5 (double): " + math.square(5.5)); // 30.25
        System.out.println("2 to the power of 3: " + math.power(2, 3)); // 82
        System.out.println("Reverse of \"COSC1200\": " + math.reverseString("COSC1200")); // 0021CSOC
    }
}
