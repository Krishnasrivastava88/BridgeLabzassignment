import java.util.Scanner;

public class WordLengthDemo {
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

    static String[][] wordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(customLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[][] table = wordLengthArray(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }

        sc.close();
    }
}
