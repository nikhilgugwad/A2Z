package UnionOfTwoSortedArrays;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution2 {
    // Function to find the union of two sorted arrays
    static ArrayList<Integer> find_union(int[] arr1, int[] arr2, int n, int m) {
        // HashSet to store unique elements from both arrays
        HashSet<Integer> set = new HashSet<>();

        // ArrayList to store the final union of arrays
        ArrayList<Integer> union = new ArrayList<>();

        // Add elements from the first array to the HashSet (automatically ensures
        // uniqueness)
        for (int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }

        // Add elements from the second array to the HashSet (automatically ensures
        // uniqueness)
        for (int i = 0; i < m; i++) {
            set.add(arr2[i]);
        }

        // Add unique elements from the HashSet to the union ArrayList
        for (int val : set) {
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
