package ClassPractice.Week5;

public class ArrayOperations {

    public static void main(String[] args){

        //array
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Original Array: " + arrayToString(numbers));
        //reverse
        reverse(numbers);
        System.out.println("Reverse Array: " + arrayToString(numbers));
        //Average

        double average = findAverage(numbers);
        System.out.println("Average of Array: " + average);
    }

    //Method for finding the average of the numbers in the array
    public static double findAverage(int[] array){
        int sum = 0;
        for(int num : array){
            sum += num;
            //sum = sum + num; - another way to write it
        }
        return(double) sum / array.length;
    }
    //reverse
    //method for reversing the order of the array
    public static void reverse(int[] array){
        int start = 0, end = array.length - 1;
        //temp is just an intermediary variable to store the array value, it can be anything
        while (start < end) {
            //Swap the values
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            //Move the start and end indices toward each other
            start++;
            end--;
        }
    }

    //method to convert the array to a string
    public static String arrayToString(int[] array){
        //StringBuilder helps convert the array to a string that can be
        //outputted to the user
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if(i < array.length-1){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
