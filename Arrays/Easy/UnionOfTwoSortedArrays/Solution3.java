package UnionOfTwoSortedArrays;

import java.util.ArrayList;

public class Solution3 {
    // Function to find the union of two sorted arrays
    static ArrayList<Integer> find_union(int[] arr1, int[] arr2, int n, int m) {
        // ArrayList to store the final union of arrays
        ArrayList<Integer> union = new ArrayList<>();

        // Pointers for iterating through arr1 and arr2
        int i = 0;
        int j = 0;

        // Compare elements of arr1 and arr2, and add smaller element to the union
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                // Add the element to the union if it's not a duplicate
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                // Add the element to the union if it's not a duplicate
                if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        // Add remaining elements of arr1 to the union
        while (i < n) {
            if (union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
                i++;
            }
        }

        // Add remaining elements of arr2 to the union
        while (j < m) {
            if (union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
                j++;
            }
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

        // Find and print the union of arrays
        ArrayList<Integer> union = find_union(arr1, arr2, n, m);
        System.out.print("Union of arrays is : ");
        for (int val : union) {
            System.out.print(val + " ");
        }
    }
}
