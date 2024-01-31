package Arrays.Medium.TwoSum;

import java.util.HashMap;

public class Better {
    // Function to find indices of two numbers in the array that sum up to the
    // target
    static int[] two_sum(int[] arr, int n, int target) {
        // Initialize an array to store the resulting indices
        int[] ans = new int[2];
        // Initialize the array with -1, indicating no result found initially
        ans[0] = ans[1] = -1;

        // Create a HashMap to store the elements and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // Check if the complement (target - current element) is present in the map
            if (map.containsKey(target - arr[i])) {
                // If found, store the current index and the index of the complement
                ans[0] = i;
                ans[1] = map.get(target - arr[i]);
                return ans;
            } else {
                // If not found, add the current element and its index to the map
                map.put(arr[i], i);
            }
        }

        // Return the array with default values (-1) if no pair is found
        return ans;
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr = { 2, 6, 5, 8, 11 };
        int n = arr.length;
        int target = 13;

        // Call the two_sum function to find indices
        int[] ans = two_sum(arr, n, target);

        // Print the result
        System.out.println("The indices are : " + ans[0] + " " + ans[1]);
    }
}
