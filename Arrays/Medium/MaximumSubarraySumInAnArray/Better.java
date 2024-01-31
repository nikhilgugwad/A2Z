package Arrays.Medium.MaximumSubarraySumInAnArray;

public class Better {
    // Function to find the maximum subarray sum using an optimized approach
    static int max_subarray_sum(int[] arr, int n) {
        int max = Integer.MIN_VALUE;

        // Iterate over the array once
        for (int i = 0; i < n; i++) {
            int sum = 0;

            // Iterate from the current index to the end of the array
            for (int j = i; j < n; j++) {
                // Add the current element to the running sum
                sum += arr[j];

                // Update the maximum subarray sum if the current sum is greater
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
