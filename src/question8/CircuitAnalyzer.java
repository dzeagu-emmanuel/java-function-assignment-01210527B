package question8;

public class CircuitAnalyzer {
    // Ohm's Law: V = I * R
    public static double calculateVoltage(double current, double resistance) {
        return current * resistance;
    }

    // Power: P = V * I
    public static double calculatePower(double voltage, double current) {
        return voltage * current;
    }

    // Resistance: R = V / I
    public static double calculateResistance(double voltage, double current) {
        return voltage / current;
    }

    public static void main(String[] args) {
        double current = 2.0; // Amperes
        double resistance = 5.0; // Ohms
        double voltage = calculateVoltage(current, resistance);
        double power = calculatePower(voltage, current);

        System.out.println("Voltage: " + voltage + " V");
        System.out.println("Power: " + power + " W");
        System.out.println("Resistance: " + resistance + " Ω");
    }
}
