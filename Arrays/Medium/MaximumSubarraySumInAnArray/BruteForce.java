package Arrays.Medium.MaximumSubarraySumInAnArray;

public class BruteForce {
    // Function to find the maximum subarray sum using Brute Force approach
    static int max_subarray_sum(int[] arr, int n) {
        int max = Integer.MIN_VALUE;

        // Iterate over all possible subarrays
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;

                // Calculate the sum of the current subarray
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                // Update the maximum subarray sum if the current subarray sum is greater
                max = Math.max(max, sum);
            }
        }

        // Return the maximum subarray sum
        return max;
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Sample array
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int n = arr.length;

        // Find and print the maximum subarray sum
        int ans = max_subarray_sum(arr, n);
        System.out.println("The maximum subarray sum is : " + ans);
    }
}
