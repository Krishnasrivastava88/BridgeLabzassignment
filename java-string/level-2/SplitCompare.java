import java.util.*;

public class SplitCompare {
    // method to find length without length()
    static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // method to split string into words without split()
    static String[] manualSplit(String text) {
        int n = getLength(text);
        ArrayList<String> words = new ArrayList<>();
        String temp = "";

        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                temp += ch;
            } else {
                if (!temp.equals("")) {
                    words.add(temp);
                    temp = "";
                }
            }
        }
        if (!temp.equals("")) words.add(temp);

        return words.toArray(new String[0]);
    }

    // method to compare arrays
    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line: ");
        String text = sc.nextLine();

        String[] manual = manualSplit(text);
        String[] builtin = text.split(" ");

        System.out.println("Manual Split: " + Arrays.toString(manual));
        System.out.println("Built-in Split: " + Arrays.toString(builtin));
        System.out.println("Arrays Equal? " + compareArrays(manual, builtin));
    }
}
