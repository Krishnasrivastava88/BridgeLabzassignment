import java.util.Scanner;

public class ShortLongWordDemo {
    static int customLength(String text) {
        int count = 0;
        try { while (true) { text.charAt(count); count++; } }
        catch (StringIndexOutOfBoundsException e) {}
        return count;
    }

    static String[] customSplit(String text) {
        int len = customLength(text), spaces = 0;
        for (int i = 0; i < len; i++) if (text.charAt(i) == ' ') spaces++;
        String[] words = new String[spaces + 1];
        int wi = 0; String cur = "";
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            if (c == ' ') { words[wi++] = cur; cur = ""; }
            else cur += c;
        }
        words[wi] = cur; return words;
    }

    static String[][] wordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(customLength(words[i]));
        }
        return result;
    }

    static String[] findShortLong(String[][] table) {
        String shortest = table[0][0], longest = table[0][0];
        int sLen = Integer.parseInt(table[0][1]);
        int lLen = Integer.parseInt(table[0][1]);
        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if (len < sLen) { sLen = len; shortest = table[i][0]; }
            if (len > lLen) { lLen = len; longest = table[i][0]; }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[][] table = wordLengthArray(words);
        String[] result = findShortLong(table);

        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);

        sc.close();
    }
}
