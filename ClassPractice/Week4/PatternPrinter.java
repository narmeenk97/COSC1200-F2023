package ClassPractice.Week4;

import java.util.Scanner;
public class PatternPrinter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String continueChoice;
        do {
            int patternChoice;
            do {
                //display pattern choices and get user's choice
                System.out.println("Choose a pattern to print: ");
                System.out.println("1. Right-angled triangle");
                System.out.println("2. Inverted right-angled triangle");
                System.out.println("Choice: ");
                patternChoice = scanner.nextInt();
            } while (patternChoice != 1 && patternChoice != 2);

            int numRows;
            do {
                System.out.println("Enter the number of rows (3-10): ");
                numRows = scanner.nextInt();
            } while (numRows < 3 || numRows > 10);

            switch (patternChoice) {
                //right-angled triangle
                case 1:
                    for (int i = 1; i <= numRows; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.println("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    //inverted right-angled triangle
                    for (int i = numRows; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.println("*");
                        }
                        System.out.println();
                    }
                    break;

            }


            System.out.println("Do you want to print another pattern? (yes/no): ");
            scanner.nextLine(); //consume newLine
            continueChoice = scanner.nextLine();
        } while (continueChoice.equalsIgnoreCase("yes"));

        System.out.println("Goodbye!");
    }
}

