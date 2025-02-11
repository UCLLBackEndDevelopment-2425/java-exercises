package _1_introduction.exercise7;

public class Application {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter a word: ");
        String word1 = scanner.nextLine();
        System.out.println("Enter a second word: ");
        String word2 = scanner.nextLine();

        if (word1.equals(word2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
