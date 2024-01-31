package Arrays.Medium.LongestConsecutiveSequenceInAnArray;

import java.util.HashSet;

public class Optimal {
    // Function to find the length of the longest consecutive sequence
    static int longest_consecutive_sequence(int[] arr, int n) {
        // If array is empty, return 0
        if (n == 0)
            return 0;

        // Create a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();
        // Initialize variable to store longest sequence length
        int longest = 1;

        // Add all elements of the array to the HashSet
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        // Iterate through the HashSet
        for (int it : set) {
            // If current element is the start of a sequence
            if (!set.contains(it - 1)) {
                // Initialize count for current sequence
                int count = 1;
                // Start checking for consecutive elements from current element
                int x = it;

                // Loop to find consecutive elements
                while (set.contains(x + 1)) {
                    x += 1; // Move to the next consecutive element
                    count += 1; // Increment count for each consecutive element
                }

                // Update longest if current sequence is longer
                longest = Math.max(longest, count);
            }
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
