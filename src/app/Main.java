package app;

public class Main {
    public static void main(String[] args) {

        double kg = 10;
        double lb = Converter.kgToLb(kg);

        double lbInput = 22;
        double kgResult = Converter.lbToKg(lbInput);

        System.out.println(kg + " kg = " + lb + " lb");
        System.out.println(lbInput + " lb = " + kgResult + " kg");
    }
}