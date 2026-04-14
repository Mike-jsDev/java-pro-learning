package app;

public class Converter {

    private static final double KG_TO_LB_RATIO = 2.20462;
    private static final double LB_TO_KG_RATIO = 0.453592;

    private static final double CELSIUS_TO_FAHRENHEIT_FACTOR = 9.0 / 5.0;
    private static final double CELSIUS_TO_FAHRENHEIT_OFFSET = 32;

    public static double kgToLb(double kg) {
        return kg * KG_TO_LB_RATIO;
    }

    public static double lbToKg(double lb) {
        return lb * LB_TO_KG_RATIO;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * CELSIUS_TO_FAHRENHEIT_FACTOR + CELSIUS_TO_FAHRENHEIT_OFFSET;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - CELSIUS_TO_FAHRENHEIT_OFFSET) / CELSIUS_TO_FAHRENHEIT_FACTOR;
    }
}