package app;

public class Converter {

    public static double milesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double kmToMiles(double km) {
        return km / 1.60934;
    }

    public static double kgToLb(double kg) {
        return kg * 2.20462;
    }

    public static double lbToKg(double lb) {
        return lb / 2.20462;
    }

    public static double celsiusToFahrenheit(double c) {return (c * 9/5) + 32;}

    public static double fahrenheitToCelsius(double f) {return (f - 32) * 5/9;}
}