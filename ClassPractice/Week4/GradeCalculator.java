package ClassPractice.Week4;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student's score (#): ");
        int score = scanner.nextInt();

        if(score < 0 || score > 100){
            System.out.println("Invalid grade score. Please enter a value between 0 and 100.");
            return;
        }

        //Determine the letter grade using if-else constructs
        char grade;
        if(score >= 80){
            grade = 'A';
        }else if(score >= 70){
            grade = 'B';
        }else if (score >= 60) {
            grade = 'C';
        }else if (score >= 50){
            grade = 'D';
        }else{
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        switch(grade){
            case 'A':
                System.out.println("Excellent work! Keep it up!");
                break;
            case 'B':
                System.out.println("Good job, but there's some room for improvement.");
                break;
            case 'C':
                System.out.println("Satisfactory, but you can do better.");
                break;
            case 'D':
                System.out.println("You need to work harder.");
                break;
            default:
                System.out.println("Unfortunately, you've failed. Try revisiting the topics.");
                break;
        }
    }
}
