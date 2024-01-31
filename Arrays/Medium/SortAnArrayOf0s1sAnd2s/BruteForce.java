package Arrays.Medium.SortAnArrayOf0s1sAnd2s;

import java.util.Arrays;

public class BruteForce {

    // Function to sort an array of 0s, 1s, and 2s using built-in sorting
    static void sort_array(int[] arr) {
        Arrays.sort(arr); // Using Arrays.sort() for simplicity
    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 2, 0, 1 };

        // Sorting the array using the provided function
        sort_array(arr);

        // Printing the sorted array
        System.out.print("Sorted array : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
