package question7;

public class QuadraticSolver {
    public static void solveQuadratic(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and different: " + root1 + ", " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and same: " + root);
        } else {
            System.out.println("No real roots (complex roots).");
        }
    }

    public static void main(String[] args) {
        double a = 1, b = -3, c = 2;
        solveQuadratic(a, b, c);
    }
}
