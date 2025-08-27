import java.util.Scanner;

public class ArrayIndexDemo {
    static void generateAIOOBE(String[] arr) {
        System.out.println(arr[arr.length]); // invalid index
    }

    static void handleAIOOBE(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"A", "B", "C"};

        try {
            generateAIOOBE(names);
        } catch (Exception e) {
            handleAIOOBE(names);
        }

        sc.close();
    }
}
