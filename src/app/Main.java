package app;

public class Main {

    private static final double CONV_K = 1.60934;

    public static void main(String[] args) {
        System.out.println("App for measures converting.");
        System.out.println("Version 1.0.");

        double miles = 5;
        double convertedMiles = convMilesToKilometers(miles);
        System.out.println("Result is " + convertedMiles + " miles.");
    }

    private static double convMilesToKilometers(double miles) {
        return miles * CONV_K;
    }
}