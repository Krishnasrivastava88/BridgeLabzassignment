import java.util.*;

public class StringPrograms {

    // 1. Compare two strings using charAt()
    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // 2. Create substring using charAt()
    static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // 3. Convert string to char array (without toCharArray)
    static char[] customToCharArray(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    // 4. Demonstrate NullPointerException
    static void generateNPE() {
        String text = null;
        System.out.println(text.length()); // this will throw NPE
    }

    static void handleNPE() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e.getMessage());
        }
    }

    // 5. Demonstrate StringIndexOutOfBoundsException
    static void generateSIOOBE(String text) {
        System.out.println(text.charAt(text.length() + 1));
    }

    static void handleSIOOBE(String text) {
        try {
            System.out.println(text.charAt(text.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException");
        }
    }

    // 6. Demonstrate IllegalArgumentException
    static void generateIAE(String text) {
        System.out.println(text.substring(5, 2));
    }

    static void handleIAE(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException");
        }
    }

    // 7. Demonstrate NumberFormatException
    static void generateNFE(String text) {
        int num = Integer.parseInt(text);
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

    // 8. Demonstrate ArrayIndexOutOfBoundsException
    static void generateAIOOBE(String[] arr) {
        System.out.println(arr[arr.length]);
    }

    static void handleAIOOBE(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException");
        }
    }

    // 9. Convert string to uppercase using charAt()
    static String customToUpperCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    // 10. Convert string to lowercase using charAt()
    static String customToLowerCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example 1: Compare Strings
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();
        boolean customCompare = compareStrings(s1, s2);
        System.out.println("Custom Compare: " + customCompare);
        System.out.println("Built-in Compare: " + s1.equals(s2));

        // Example 2: Substring
        System.out.print("\nEnter text: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        String sub1 = customSubstring(text, start, end);
        String sub2 = text.substring(start, end);
        System.out.println("Custom Substring: " + sub1);
        System.out.println("Built-in Substring: " + sub2);
        System.out.println("Compare: " + compareStrings(sub1, sub2));

        // Example 3: toCharArray
        char[] arr1 = customToCharArray(text);
        char[] arr2 = text.toCharArray();
        System.out.println("Custom char array equals built-in? " + compareCharArrays(arr1, arr2));

        // Example 4: NullPointerException
        try {
            generateNPE();
        } catch (Exception e) {
            handleNPE();
        }

        // Example 5: StringIndexOutOfBoundsException
        try {
            generateSIOOBE(text);
        } catch (Exception e) {
            handleSIOOBE(text);
        }

        // Example 6: IllegalArgumentException
        try {
            generateIAE(text);
        } catch (Exception e) {
            handleIAE(text);
        }

        // Example 7: NumberFormatException
        try {
            generateNFE(text);
        } catch (Exception e) {
            handleNFE(text);
        }

        // Example 8: ArrayIndexOutOfBoundsException
        String[] names = {"A", "B", "C"};
        try {
            generateAIOOBE(names);
        } catch (Exception e) {
            handleAIOOBE(names);
        }

        // Example 9: Uppercase
        String upper1 = customToUpperCase(text);
        String upper2 = text.toUpperCase();
        System.out.println("Custom Upper: " + upper1);
        System.out.println("Built-in Upper: " + upper2);
        System.out.println("Compare: " + compareStrings(upper1, upper2));

        // Example 10: Lowercase
        String lower1 = customToLowerCase(text);
        String lower2 = text.toLowerCase();
        System.out.println("Custom Lower: " + lower1);
        System.out.println("Built-in Lower: " + lower2);
        System.out.println("Compare: " + compareStrings(lower1, lower2));

        sc.close();
    }
}
