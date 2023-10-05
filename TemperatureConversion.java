import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double temperature = input.nextDouble();

        System.out.print("Enter the original unit of measurement (C, F, or K): ");
        String originalUnit = input.next().toUpperCase();

        double convertedCelsius = 0.0;
        double convertedFahrenheit = 0.0;
        double convertedKelvin = 0.0;

        if (originalUnit.equals("C")) {
            convertedCelsius = temperature;
            convertedFahrenheit = celsiusToFahrenheit(temperature);
            convertedKelvin = celsiusToKelvin(temperature);
        } else if (originalUnit.equals("F")) {
            convertedFahrenheit = temperature;
            convertedCelsius = fahrenheitToCelsius(temperature);
            convertedKelvin = celsiusToKelvin(fahrenheitToCelsius(temperature));
        } else if (originalUnit.equals("K")) {
            convertedKelvin = temperature;
            convertedCelsius = kelvinToCelsius(temperature);
            convertedFahrenheit = celsiusToFahrenheit(kelvinToCelsius(temperature));
        } else {
            System.out.println("Invalid unit of measurement. Please use C, F, or K.");
            System.exit(1);
        }

        System.out.println("Converted Temperatures:");
        System.out.println("Celsius: " + convertedCelsius + "°C");
        System.out.println("Fahrenheit: " + convertedFahrenheit + "°F");
        System.out.println("Kelvin: " + convertedKelvin + "K");

        input.close();
    }

    // Conversion functions
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    private static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    private static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}
