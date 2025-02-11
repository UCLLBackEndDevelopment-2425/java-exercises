package _1_introduction.exercise2;

public class Application {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter a number: ");
        double number1 = scanner.nextDouble();
        System.out.println("Enter a second number: ");
        double number2 = scanner.nextDouble();
        System.out.println("Enter a third number: ");
        double number3 = scanner.nextDouble();
        double sum = number1 + number2 + number3;
        double average = sum / 3;

        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The average is " + average);
    }
}
