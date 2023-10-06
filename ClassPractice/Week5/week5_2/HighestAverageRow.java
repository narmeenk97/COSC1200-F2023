package ClassPractice.Week5.week5_2;

import java.util.Arrays;

public class HighestAverageRow {

    public static void main(String[] args){

        int[][] matrix = {
                {3, 2, 1, 7},
                {9, 11, 5, 4},
                {6, 0, 13, 17},
                {7, 21, 14, 15}
        };

        //BONUS: Sort each row in ascending order
        for(int i=0; i< matrix.length; i++){
            Arrays.sort(matrix[i]);
        }

        //display the sorted matrix
        displayMatrix(matrix);

        int highestRowIndex = getHighestAverageRow(matrix);
        System.out.println("Row with the highest average is: "
                + Arrays.toString(matrix[highestRowIndex]));

    }

    public static void displayMatrix(int[][] matrix){

        for(int i=0; i<matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static int getHighestAverageRow(int[][] matrix){

        double maxAverage = Double.MIN_VALUE; //minimum value that java can hold in a double
        int maxAvgRowIndex = -1;

        for(int i=0; i<matrix.length; i++){
            //initialize a variable to store the sum of the elements in the current row
            double sum = 0;
            //loop through each element of the current row to compute the sum
            for(int j=0; j<matrix[i].length; j++){
                //add the current element to the sum
                sum += matrix[i][j];
            }
            //compute the average of the current row
            double average = sum / matrix[i].length;
            if(average > maxAverage){
                maxAverage = average;  //update the maxAverage
                maxAvgRowIndex = i;    //store the index of the row with the highest average
            }
        }
        return maxAvgRowIndex;
    }
}
