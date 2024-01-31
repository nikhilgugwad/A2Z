package Arrays.Medium.TwoSum;

public class BruteForce {
    // Function to find indices of two numbers in the array that sum up to the
    // target
    static int[] two_sum(int[] arr, int n, int target) {
        // Initialize an array to store the resulting indices
        int[] ans = new int[2];
        // Initialize the array with -1, indicating no result found initially
        ans[0] = ans[1] = -1;

        // Nested loop to iterate through all pairs of elements in the array
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Check if the sum of current pair equals the target
                if (arr[i] + arr[j] == target) {
                    // If a pair is found, store the indices and return
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
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

        // Call the two_sum function to find indices
        int[] ans = two_sum(arr, n, target);

        // Print the result
        System.out.println("The indices are : " + ans[0] + " " + ans[1]);
    }
}
