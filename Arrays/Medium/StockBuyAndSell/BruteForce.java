package Arrays.Medium.StockBuyAndSell;

public class BruteForce {
    // Function to calculate maximum profit using brute force approach
    static int stock_buy_and_sell(int[] arr, int n) {
        // Variable to store the maximum profit
        int max = 0;

        // Nested loops to iterate through all possible pairs of buying and selling days
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Check if selling on day j after buying on day i would yield a higher profit
                if (arr[j] > arr[i]) {
                    // Update max profit if the current pair yields a higher profit
                    max = Math.max(max, arr[j] - arr[i]);
                }
            }
        }

        // Return the maximum profit
        return max;
    }

    // Main method for testing the stock_buy_and_sell function
    public static void main(String[] args) {
        // Example input array representing stock prices on each day
        int arr[] = { 7, 1, 5, 3, 6, 4 };

        // Get the length of the array
        int n = arr.length;

        // Calculate the maximum profit using the stock_buy_and_sell function
        int profit = stock_buy_and_sell(arr, n);

        // Print the result
        System.out.println("The maximum profit we can achieve is : " + profit);
    }
}
