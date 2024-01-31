package Arrays.Medium.LongestConsecutiveSequenceInAnArray;

public class BruteForce {
    // Function to perform linear search in an array
    static boolean linear_search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return true; // If element found, return true
            }
        }
        return false; // If element not found, return false
    }

    // Function to find the length of the longest consecutive sequence
    static int longest_consecutive_sequence(int[] arr, int n) {
        int longest = 1; // Initialize longest sequence length to 1
        for (int i = 0; i < n; i++) {
            int x = arr[i]; // Current element
            int count = 1; // Initialize count for current sequence

            // Loop to find consecutive elements in sequence
            while (linear_search(arr, x + 1) == true) {
                count += 1; // Increment count for each consecutive element
                x += 1; // Move to the next consecutive element
            }

            longest = Math.max(longest, count); // Update longest if current sequence is longer
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
