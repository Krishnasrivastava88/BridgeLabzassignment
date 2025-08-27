import java.util.Scanner;

public class StringIndexDemo {
    static void generateSIOOBE(String text) {
        System.out.println(text.charAt(text.length())); // invalid index
    }

    static void handleSIOOBE(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        try {
            generateSIOOBE(text);
        } catch (Exception e) {
            handleSIOOBE(text);
        }

        sc.close();
    }
}
