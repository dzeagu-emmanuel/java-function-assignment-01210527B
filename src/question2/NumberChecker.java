package question2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberChecker {
    public static String checkNumber(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter a number: ");
            try {
                num = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int num = getUserInput();
        System.out.println("The number is: " + checkNumber(num));
    }
}