import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; // If lengths are different, they can't be anagrams
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s = scanner.nextLine();
        System.out.println("Enter second string: ");
        String t = scanner.nextLine();
        scanner.close();

        Solution solution = new Solution();
        boolean result = solution.isAnagram(s, t);
        System.out.println("Are the two strings anagrams? " + result);
    }
}
