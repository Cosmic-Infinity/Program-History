/*
7. Write a program that converts temperatures between Fahrenheit and Celsius.
Handle exceptions for invalid input values (e.g., non-numeric input or temperatures outside reasonable ranges).
 */

import java.util.*;

class Temperature {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        try {
            System.out.println("Enter temperature value:");
            double temp = ob.nextDouble();

            System.out.println("Enter the unit (C for Celsius, F for Fahrenheit):");
            String unit = ob.next();

            if (unit.equalsIgnoreCase("C")) {
                if (temp < -273.15) {
                    throw new InvalidTemperatureException("Temperature below absolute zero in C");
                }
                double fahrenheit = celsiusToFahrenheit(temp);
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            } else if (unit.equalsIgnoreCase("F")) {
                if (temp < -459.67) {
                    throw new InvalidTemperatureException("Temperature below absolute in F.");
                }
                double celsius = fahrenheitToCelsius(temp);
                System.out.println("Temperature in Celsius: " + celsius);
            } else {
                throw new InputMismatchException("Invalid unit. Use 'C' or 'F' only.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } catch (InvalidTemperatureException e) {
            System.out.println(e.getMessage());
        }
    }

    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

class InvalidTemperatureException extends Exception {
    InvalidTemperatureException(String message) {
        super(message);
    }
}
