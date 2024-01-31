package Arrays.Medium.MaximumSubarraySumInAnArray;

public class FollowUp {
    // Function to find and print the subarray with the maximum sum
    static void max_subarray_sum(int[] arr, int n) {
        long max = Long.MIN_VALUE; // Variable to store the maximum sum
        long sum = 0; // Variable to store the current sum
        int start = 0; // Variable to store the start index of the current subarray
        int ansStart = -1, ansEnd = -1; // Variables to store the start and end index of the maximum subarray

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // If the current sum becomes zero, update the start index of the current
            // subarray
            if (sum == 0) {
                start = i;
            }

            // Add the current element to the running sum
            sum += arr[i];

            // Update the maximum subarray sum and its start and end indices if the current
            // sum is greater
            if (sum > max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            }

            // If the current sum becomes negative, reset it to zero
            if (sum < 0) {
                sum = 0;
            }
        }

        // Print the subarray with the maximum sum
        System.out.print("The subarray is : ");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }

        // Print the sum of the above subarray
        System.out.println();
        System.out.print("The sum of the above subarray is : " + max);
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Sample array
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int n = arr.length;

        // Find and print the maximum subarray sum and the corresponding subarray
        max_subarray_sum(arr, n);
    }
}
