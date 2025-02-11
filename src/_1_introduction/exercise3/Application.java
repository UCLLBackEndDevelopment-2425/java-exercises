package _1_introduction.exercise3;

public class Application {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter a temperature in Celsius: ");
        double tempInCelsius = scanner.nextDouble();

        double tempInFahrenheit = (tempInCelsius * 9/5) + 32;
        // by default decimal numbers are doubles
        // float some = 654.321f
        double tempInKelvin = tempInCelsius + 273.15;

        System.out.println("Temperature in Fahrenheit: " + tempInFahrenheit);
        System.out.println("Temperature in Kelvin: " + tempInKelvin);
    }
}
