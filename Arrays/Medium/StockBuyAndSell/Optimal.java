package Arrays.Medium.StockBuyAndSell;

public class Optimal {
    // Function to calculate maximum profit using optimal approach
    static int stock_buy_and_sell(int[] arr, int n) {
        // Variable to store the maximum profit
        int maxProfit = 0;

        // Variable to store the minimum price encountered so far
        int minPrice = Integer.MAX_VALUE;

        // Iterate through the array to find the optimal buying and selling points
        for (int i = 0; i < n; i++) {
            // Update the minimum price if the current element is smaller
            minPrice = Math.min(minPrice, arr[i]);

            // Calculate the profit if selling on the current day and update maxProfit
            maxProfit = Math.max(maxProfit, arr[i] - minPrice);
        }

        // Return the maximum profit
        return maxProfit;
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
