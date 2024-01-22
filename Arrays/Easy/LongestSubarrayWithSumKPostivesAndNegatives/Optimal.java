package LongestSubarrayWithSumKPostivesAndNegatives;

import java.util.HashMap;

public class Optimal {

    // Function to find the length of the longest subarray with the given sum
    static int longest_subarray(int[] arr, int n, int k) {
        // HashMap to store the cumulative sum and its corresponding index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Variable to track the maximum length of the subarray
        int maxLength = 0;

        // Variable to track the cumulative sum
        int sum = 0;

        // Iterating through the array
        for (int i = 0; i < n; i++) {
            // Adding the current element to the cumulative sum
            sum += arr[i];

            // Check if the cumulative sum is equal to the target sum (k)
            if (sum == k) {
                maxLength = Math.max(maxLength, i + 1);
            }

            // Calculate the remaining sum needed to reach the target sum
            int rem = sum - k;

            // Check if the remaining sum is present in the HashMap
            if (map.containsKey(rem)) {
                // If yes, calculate the length of the subarray and update maxLength
                int len = i - map.get(rem);
                maxLength = Math.max(maxLength, len);
            }

            // Store the cumulative sum and its index in the HashMap
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        // Return the length of the longest subarray with the given sum
        return maxLength;
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = { -1, 1, 1 };
        // Length of the array
        int n = arr.length;
        // Target sum
        int k = 1;

        // Call the function to find the length of the longest subarray
        int length = longest_subarray(arr, n, k);

        // Print the result
        System.out.println("The length of the longest subarray with given sum is : " + length);
    }
}
