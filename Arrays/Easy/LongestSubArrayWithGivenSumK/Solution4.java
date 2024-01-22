package LongestSubArrayWithGivenSumK;

public class Solution4 {
    // Function to find the length of the longest subarray with sum equal to k
    static int longest_subarray(int[] arr, int n, long k) {
        // Initialize two pointers, left and right
        int left = 0;
        int right = 0;
        // Variable to store the maximum length of subarray with sum equal to k
        int maxLength = 0;
        // Variable to track the current sum of the subarray
        long sum = arr[0];

        // Sliding window approach
        while (right < n) {
            // If the current sum is greater than k, move the left pointer
            if (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            // If the current sum is equal to k, update the maximum length
            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }

            // Move the right pointer and update the current sum
            right++;
            if (right < n)
                sum += arr[right];
        }

        // Return the length of the longest subarray with sum equal to k
        return maxLength;
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = { 2, 3, 5, 1, 9 };
        // Length of the array
        int n = arr.length;
        // Target sum
        long k = 10;
        // Find the length of the longest subarray with sum equal to k
        int length = longest_subarray(arr, n, k);
        // Print the result
        System.out.println("The length of the longest subarray with given sum is : " + length);
    }
}
