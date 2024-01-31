package Arrays.Medium.CountSubarraysWithGivenSum; // Package declaration

import java.util.HashMap; // Import HashMap class

public class Optimal { // Class declaration
    static int count_subarrays(int[] arr, int n, int givenSum) { // Method to count subarrays with a given sum
        HashMap<Integer, Integer> map = new HashMap<>(); // Create a HashMap to store prefix sums and their frequencies

        int preSum = 0; // Initialize prefix sum
        int count = 0; // Initialize count of subarrays

        map.put(0, 1); // Add initial prefix sum (0) with frequency 1 to the map

        for (int i = 0; i < n; i++) { // Loop through the array elements
            preSum += arr[i]; // Calculate prefix sum

            int remove = preSum - givenSum; // Calculate the value to remove from the prefix sum

            count += map.getOrDefault(remove, 0); // Increment count by the frequency of the required prefix sum

            map.put(preSum, map.getOrDefault(preSum, 0) + 1); // Update the map with the current prefix sum
        }

        return count; // Return total count of subarrays
    }

    public static void main(String[] args) { // Main method
        int[] arr = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 }; // Input array
        int n = arr.length; // Length of array
        int givenSum = 3; // Given sum

        // Count subarrays with given sum
        int allSubarrays = count_subarrays(arr, n, givenSum);

        // Print total count of subarrays with given sum
        System.out.println("All subarrays that add up to the given sum are : " + allSubarrays);
    }
}
