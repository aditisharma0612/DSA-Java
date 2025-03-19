import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs); // Sorting helps find the prefix easily
        String str1 = strs[0]; // First string (smallest lexicographically)
        String str2 = strs[strs.length - 1]; // Last string (largest lexicographically)
        int index = 0;

        while (index < str1.length() && index < str2.length()) {
            if (str1.charAt(index) == str2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return str1.substring(0, index); // Return the common prefix
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] strs = new String[n];
        System.out.println("Enter the strings: ");
        for (int i = 0; i < n; i++) {
            strs[i] = scanner.nextLine();
        }
        scanner.close();

        Solution solution = new Solution();
        String result = solution.longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);
    }
}
