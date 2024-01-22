package LongestSubarrayWithSumKPostivesAndNegatives;

public class BruteForce {

    // Method to find the length of the longest subarray with sum K
    static int longest_subarray(int[] arr, int n, int k) {
        // Initialize variables
        int length = 0;

        // Iterate through all possible subarrays using nested loops
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int s = 0; // Initialize sum for current subarray

                // Calculate the sum of elements in the current subarray
                for (int l = i; l <= j; l++) {
                    s += arr[l];
                }

                // If the sum matches the target, update the maximum length
                if (s == k) {
                    length = Math.max(length, j - i + 1); // Calculate and store the length of the subarray
                }
            }
        }

        return length; // Return the length of the longest subarray found
    }

    // Main function to demonstrate the code
    public static void main(String[] args) {
        int[] arr = { -1, 1, 1 };
        int n = arr.length;
        int k = 1;
        int length = longest_subarray(arr, n, k);
        System.out.println("The length of the longest subarray with given sum is : " + length);
    }
}
