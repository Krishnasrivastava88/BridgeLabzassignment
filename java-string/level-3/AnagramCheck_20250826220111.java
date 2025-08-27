import java.util.Scanner;

public class AnagramCheck {

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] freq = new int[256];
        for (char c : s1.toCharArray()) freq[c]++;
        for (char c : s2.toCharArray()) freq[c]--;

        for (int i : freq) if (i != 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second word: ");
        String s2 = sc.nextLine();

        System.out.println("Are they anagrams? " + isAnagram(s1, s2));
    }
}
