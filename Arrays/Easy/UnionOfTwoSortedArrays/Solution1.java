package UnionOfTwoSortedArrays;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution1 {
    // Function to find the union of two sorted arrays
    static ArrayList<Integer> find_union(int[] arr1, int[] arr2, int n, int m) {
        // HashMap to store the frequency of each element in the union
        HashMap<Integer, Integer> freq = new HashMap<>();

        // ArrayList to store the final union of arrays
        ArrayList<Integer> union = new ArrayList<>();

        // Count the frequency of elements in the first array
        for (int i = 0; i < n; i++) {
            freq.put(arr1[i], freq.getOrDefault(arr1[i], 0) + 1);
        }

        // Count the frequency of elements in the second array
        for (int i = 0; i < m; i++) {
            freq.put(arr2[i], freq.getOrDefault(arr2[i], 0) + 1);
        }

        // Add unique elements to the union ArrayList
        for (int val : freq.keySet()) {
            union.add(val);
        }

        // Return the union ArrayList
        return union;
    }

    public static void main(String[] args) {
        // Example arrays
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };
        int n = arr1.length;
        int m = arr2.length;

        // Print the union of arrays
        System.out.print("Union of arrays is : ");
        ArrayList<Integer> union = find_union(arr1, arr2, n, m);
        for (int val : union) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
