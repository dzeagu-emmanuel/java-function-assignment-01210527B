package question9;

public class CubicSolver {
    public static void solveCubic(double a, double b, double c, double d) {

        double delta0 = b * b - 3 * a * c;
        double delta1 = 2 * b * b * b - 9 * a * b * c + 27 * a * a * d;
        double C = Math.cbrt((delta1 + Math.sqrt(delta1 * delta1 - 4 * delta0 * delta0 * delta0)) / 2);
        double root = -(1 / (3 * a)) * (b + C + delta0 / C);

        System.out.println("One real root is: " + root);
    }

    public static void main(String[] args) {
        double a = 1, b = -6, c = 11, d = -6;
        solveCubic(a, b, c, d);
    }
}
