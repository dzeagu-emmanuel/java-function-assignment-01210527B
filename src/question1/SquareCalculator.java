package question1;

public class SquareCalculator {
    public static double square(double number) {
        return number * number;
    }

    public static void main(String[] args) {
        double num = 5.0;
        System.out.println("Square of " + num + " is: " + square(num));
    }
}
