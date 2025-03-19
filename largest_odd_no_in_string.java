import java.util.Scanner;

class Solution {
    public String largestOddNumber(String num) {
        int len = num.length();
        
        // Traverse from right to left
        for (int i = len - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 != 0) { // Check if the digit is odd
                return num.substring(0, i + 1); // Return the largest odd substring
            }
        }
        return ""; // No odd number found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String input = scanner.nextLine();
        scanner.close();

        Solution solution = new Solution();
        String result = solution.largestOddNumber(input);
        System.out.println("Largest odd-numbered substring: " + result);
    }
}
