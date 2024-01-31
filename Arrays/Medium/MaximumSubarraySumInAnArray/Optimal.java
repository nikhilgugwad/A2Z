package Arrays.Medium.MaximumSubarraySumInAnArray;

public class Optimal {
    // Function to find the maximum subarray sum using an optimal approach
    static int max_subarray_sum(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        // Iterate through the array once
        for (int i = 0; i < n; i++) {
            // Add the current element to the running sum
            sum += arr[i];

            // Update the maximum subarray sum if the current sum is greater
            max = Math.max(max, sum);

            // If the current sum becomes negative, reset it to zero
            if (sum < 0) {
                sum = 0;
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
