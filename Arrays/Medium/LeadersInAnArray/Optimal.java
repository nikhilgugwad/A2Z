package Arrays.Medium.LeadersInAnArray;

import java.util.ArrayList;

public class Optimal {
    // Method to find leaders in the array
    static ArrayList<Integer> array_leaders(int[] arr, int n) {
        // Initialize an ArrayList to store the leaders
        ArrayList<Integer> ans = new ArrayList<>();

        // Initialize the maximum element seen so far to the smallest possible integer
        // value
        int max = Integer.MIN_VALUE;

        // Iterate through the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Check if the current element is greater than the maximum element seen so far
            if (arr[i] > max) {
                // If yes, update the maximum element seen so far to the current element
                max = arr[i];
                // Add the current element to the list of leaders
                ans.add(arr[i]);
            }
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
