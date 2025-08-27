import java.util.*;

public class ManualTrim {
    static String manualTrim(String s) {
        int start = 0, end = s.length() - 1;

        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;

        String result = "";
        for (int i = start; i <= end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text with spaces: ");
        String text = sc.nextLine();

        String trimmed = manualTrim(text);
        System.out.println("Manual Trim: '" + trimmed + "'");
        System.out.println("Built-in Trim: '" + text.trim() + "'");
        System.out.println("Equal? " + trimmed.equals(text.trim()));
    }
}
