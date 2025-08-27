import java.util.Scanner;

public class IllegalArgumentDemo {
    static void generateIAE(String text) {
        System.out.println(text.substring(5, 2)); // invalid indices
    }

    static void handleIAE(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        try {
            generateIAE(text);
        } catch (Exception e) {
            handleIAE(text);
        }

        sc.close();
    }
}
