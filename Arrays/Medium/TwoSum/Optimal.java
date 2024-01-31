package Arrays.Medium.TwoSum;

import java.util.Arrays;

public class Optimal {
    // Function to find indices of two numbers in the sorted array that sum up to
    // the target
    static int[] two_sum(int[] arr, int n, int target) {
        // Sort the array in ascending order
        Arrays.sort(arr);

        // Initialize an array to store the resulting indices
        int[] ans = new int[2];
        // Initialize the array with -1, indicating no result found initially
        ans[0] = ans[1] = -1;

        // Initialize two pointers, one at the beginning and one at the end of the array
        int left = 0;
        int right = n - 1;

        // Iterate through the array until the two pointers meet
        while (left < right) {
            // Check if the sum of elements at the current pointers is less than the target
            if (arr[left] + arr[right] < target) {
                // If so, move the left pointer to the right
                left++;
            } else if (arr[left] + arr[right] > target) {
                // If the sum is greater than the target, move the right pointer to the left
                right--;
            } else {
                // If the sum is equal to the target, store the indices and return
                ans[0] = left;
                ans[1] = right;
                return ans;
            }
        }

        // Return the array with default values (-1) if no pair is found
        return ans;
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr = { 2, 6, 5, 8, 11 };
        int n = arr.length;
        int target = 14;

        // Call the two_sum function to find indices in the sorted array
        int[] ans = two_sum(arr, n, target);

        // Print the result
        System.out.println("The indices (sorted array) are : " + ans[0] + " " + ans[1]);
    }
}
