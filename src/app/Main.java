package app;

public class Main {
    public static void main(String[] args) {

        double km = 16.0;
        double miles = Converter.kmToMiles(km);

        double milesInput = 10.0;
        double kmResult = Converter.milesToKm(milesInput);

        System.out.println(km + " km = " + miles + " miles");
        System.out.println(milesInput + " miles = " + kmResult + " km");
    }
}
