package Arrays.Medium.CountSubarraysWithGivenSum;

public class BruteForce {
    // Method to count subarrays with a given sum
    static int count_subarrays(int[] arr, int n, int givenSum) {
        int count = 0; // Initialize count of subarrays

        // Nested loops to iterate through all possible subarrays
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0; // Initialize sum for each subarray
                // Calculate sum of current subarray
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                // If sum of current subarray equals given sum, increment count
                if (sum == givenSum) {
                    count++;
                }
            }
        }

        return count; // Return total count of subarrays
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4 }; // Input array
        int n = arr.length; // Length of array
        int givenSum = 6; // Given sum
        // Count subarrays with given sum
        int allSubarrays = count_subarrays(arr, n, givenSum);
        // Print total count of subarrays with given sum
        System.out.println("All subarrays that add up to the given sum are: " + allSubarrays);
    }
}
