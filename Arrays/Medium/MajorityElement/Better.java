package Arrays.Medium.MajorityElement;

import java.util.HashMap;
import java.util.Map;

public class Better {

    // Function to find the majority element using a better approach with HashMap
    static int max_occurrence(int[] arr, int n) {
        // Create a HashMap to store the count of occurrences for each element
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count occurrences of each element in the array
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Iterate over the entries in the HashMap
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // If the count of an element is greater than half the array length, it is the
            // majority element
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }

        // If no majority element is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        int n = arr.length;

        // Find the majority element
        int ans = max_occurrence(arr, n);

        // Print the result
        System.out.println("Majority element: " + ans);
    }
}
