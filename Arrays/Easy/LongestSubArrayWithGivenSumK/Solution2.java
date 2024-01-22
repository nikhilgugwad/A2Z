package LongestSubArrayWithGivenSumK;

public class Solution2 {

    // Method to find the length of the longest subarray with sum K
    static int longest_subarray(int[] arr, int n, long k) {
        // Initialize variables
        int length = 0;

        // Iterate through the array, starting each subarray from a different index
        for (int i = 0; i < n; i++) {
            long s = 0; // Initialize sum for the current subarray

            // Iterate from the current starting index to the end of the array
            for (int j = i; j < n; j++) {
                s += arr[j]; // Add the current element to the sum

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
        int[] arr = { 2, 3, 5, 1, 9 };
        int n = arr.length;
        long k = 10;

        int length = longest_subarray(arr, n, k);
        System.out.println("The length of the longest subarray with given sum is : " + length);
    }
}
