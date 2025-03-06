package app;

public class Main {
    private static final double CONV_MILES_TO_KM = 1.60934;

    public static void main(String[] args) {
        System.out.println("Converter App.");
        System.out.println("App for measures converting.");
        System.out.println("Version 1.0.");

        double miles = 10;
        System.out.println(miles + " miles = " + convMilesToKm(miles) + " km.");
    }

    private static double convMilesToKm(double miles) {
        return miles * CONV_MILES_TO_KM;
    }
}
