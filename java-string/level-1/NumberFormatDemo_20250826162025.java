import java.util.Scanner;

public class NumberFormatDemo {
    static void generateNFE(String text) {
        int num = Integer.parseInt(text); // error if not number
        System.out.println(num);
    }

    static void handleNFE(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        try {
            generateNFE(text);
        } catch (Exception e) {
            handleNFE(text);
        }

        sc.close();
    }
}
