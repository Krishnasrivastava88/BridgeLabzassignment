import java.util.Scanner;

public class SplitDemo {
    static int customLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {}
        return count;
    }

    static String[] customSplit(String text) {
        int len = customLength(text);
        // count spaces
        int spaces = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') spaces++;
        }
        String[] words = new String[spaces + 1];
        int wordIndex = 0;
        String current = "";
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                words[wordIndex++] = current;
                current = "";
            } else {
                current += c;
            }
        }
        words[wordIndex] = current;
        return words;
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String text = sc.nextLine();

        String[] custom = customSplit(text);
        String[] builtin = text.split(" ");

        System.out.println("Custom split:");
        for (String w : custom) System.out.print(w + " | ");
        System.out.println("\nBuilt-in split:");
        for (String w : builtin) System.out.print(w + " | ");

        System.out.println("\nArrays equal? " + compareArrays(custom, builtin));
        sc.close();
    }
}
