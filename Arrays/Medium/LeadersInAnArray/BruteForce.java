package Arrays.Medium.LeadersInAnArray;

import java.util.ArrayList;

public class BruteForce {
    // Method to find leaders in the array
    static ArrayList<Integer> array_leaders(int[] arr, int n) {
        // Initialize an ArrayList to store the leaders
        ArrayList<Integer> ans = new ArrayList<>();

        // Iterate through each element of the array
        for (int i = 0; i < n; i++) {
            // Assume current element is a leader
            boolean leader = true;

            // Check if there are any elements to the right greater than the current element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    // If there's a greater element to the right, current element is not a leader
                    leader = false;
                    break; // No need to check further for this element
                }
            }

            // If current element is still a leader after checking, add it to the result
            if (leader)
                ans.add(arr[i]);
        }

        return ans; // Return the list of leaders
    }

    // Main method to test the array_leaders method
    public static void main(String[] args) {
        int[] arr = { 10, 22, 12, 3, 0, 6 };
        int n = arr.length;

        // Find the leaders in the array
        ArrayList<Integer> ans = array_leaders(arr, n);

        // Print the leaders
        System.out.println("The leaders of an array are : " + ans);
    }
}
