package app;

public class Main {
    public static void main(String[] args) {

        // --- Converter ---
        double kg = 10;
        double lb = Converter.kgToLb(kg);

        double lbInput = 22;
        double kgResult = Converter.lbToKg(lbInput);

        double c = 25;
        double f = Converter.celsiusToFahrenheit(c);

        double f2 = 77;
        double c2 = Converter.fahrenheitToCelsius(f2);

        System.out.println(kg + " kg = " + lb + " lb");
        System.out.println(lbInput + " lb = " + kgResult + " kg");
        System.out.println(c + " C = " + f + " F");
        System.out.println(f2 + " F = " + c2 + " C");

        // --- Customer ---
        Customer customer = getCustomer(getData());

        String output = "Customer: " + customer.getName() +
                ", phone: " + customer.getPhone();

        getOutput(output);
    }

    // --- Customer helpers ---

    public static String[] getData() {
        return new String[]{"Mike", "+380501234567"};
    }

    public static Customer getCustomer(String[] data) {
        return new Customer(data[0], data[1]);
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}