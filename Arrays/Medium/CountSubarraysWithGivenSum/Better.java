package Arrays.Medium.CountSubarraysWithGivenSum; // Package declaration

public class Better { // Class declaration
    static int count_subarrays(int[] arr, int n, int givenSum) { // Method to count subarrays with a given sum
        int count = 0; // Initialize count of subarrays

        for (int i = 0; i < n; i++) { // Loop through starting index of subarray
            int sum = 0; // Initialize sum for each subarray
            for (int j = i; j < n; j++) { // Loop through ending index of subarray
                sum += arr[j]; // Add current element to sum

                if (sum == givenSum) { // Check if sum matches the given sum
                    count++; // Increment count of subarrays with given sum
                }
            }
        }

        return count; // Return total count of subarrays
    }

    public static void main(String[] args) { // Main method
        int[] arr = { 3, 1, 2, 4 }; // Input array
        int n = arr.length; // Length of array
        int givenSum = 6; // Given sum

        // Count subarrays with given sum
        int allSubarrays = count_subarrays(arr, n, givenSum);

        // Print total count of subarrays with given sum
        System.out.println("All subarrays that add up to the given sum are: " + allSubarrays);
    }
}
