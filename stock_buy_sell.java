import java.util.Scanner;

class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0]; // Initialize buy price as the first day's price
        int profit = 0; // Initialize profit as 0

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i]; // Update the minimum buying price
            }
            profit = Math.max(profit, prices[i] - buy); // Update max profit
        }
        return profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of days
        System.out.print("Enter the number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        // Input stock prices
        System.out.println("Enter the stock prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Compute max profit
        Solution solution = new Solution();
        int maxProfit = solution.maxProfit(prices);

        // Output the result
        System.out.println("Maximum Profit: " + maxProfit);

        sc.close();
    }
}
