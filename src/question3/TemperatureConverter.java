package question3;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        double celsius = 25.0;
        System.out.println(celsius + "°C is " + celsiusToFahrenheit(celsius) + "°F");
    }
}
