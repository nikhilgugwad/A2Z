package Arrays.Medium.LongestConsecutiveSequenceInAnArray;

import java.util.Arrays;

public class Better {
    // Function to find the length of the longest consecutive sequence
    static int longest_consecutive_sequence(int[] arr, int n) {
        // If array is empty, return 0
        if (n == 0)
            return 0;

        // Sort the array
        Arrays.sort(arr);
        // Initialize variables
        int lastSmaller = Integer.MIN_VALUE; // Track the last smaller element
        int longest = 1; // Track the length of the longest consecutive sequence
        int count = 0; // Counter for consecutive elements

        // Iterate through the sorted array
        for (int i = 0; i < n; i++) {
            // If current element is one more than the last smaller element
            if (arr[i] - 1 == lastSmaller) {
                count += 1; // Increment the count of consecutive elements
                lastSmaller = arr[i]; // Update lastSmaller to current element
            }
            // If current element is different from last smaller element
            else if (arr[i] != lastSmaller) {
                count = 1; // Reset count to 1
                lastSmaller = arr[i]; // Update lastSmaller to current element
            }

            // Update longest if current sequence is longer
            longest = Math.max(longest, count);
        }

        return longest; // Return the length of the longest consecutive sequence
    }

    public static void main(String[] args) {
        int[] arr = { 100, 200, 1, 2, 3, 4 }; // Sample array
        int n = arr.length; // Length of the array
        int ans = longest_consecutive_sequence(arr, n); // Find the longest consecutive sequence
        System.out.println("The longest consecutive sequence is : " + ans); // Print the result
    }
}
