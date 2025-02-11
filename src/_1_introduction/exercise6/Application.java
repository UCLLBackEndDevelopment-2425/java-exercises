package _1_introduction.exercise6;

public class Application {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter a whole number: ");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter a second whole number: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println(number1 + " is greater than " + number2);
        } else if (number1 == number2) {
            System.out.println("the numbers are equal");
        } else {
            System.out.println(number2 + " is greater than " + number1);
        }
    }
}
