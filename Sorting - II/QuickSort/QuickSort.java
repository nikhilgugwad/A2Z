import java.util.*;

public class QuickSort {
    // Partition method for selecting a pivot and rearranging elements
    static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(low);
        int i = low;
        int j = high;

        // Continue until i and j pointers meet
        while (i < j) {
            // Find an element greater than the pivot
            while (arr.get(i) <= pivot && i <= high - 1) {
                i++;
            }

            // Find an element less than or equal to the pivot
            while (arr.get(j) > pivot && j >= low + 1) {
                j--;
            }

            // Swap elements at positions i and j
            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        // Swap the pivot element with the element at index j
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);

        // Return the updated index of the pivot element
        return j;
    }

    // Recursive function to perform Quick Sort
    static void qs(List<Integer> arr, int low, int high) {
        if (low < high) {
            // Get the pivot index after partitioning
            int pIndex = partition(arr, low, high);

            // Recursively call qs for left and right partitions
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }

    // Entry point for Quick Sort algorithm
    public static List<Integer> quickSort(List<Integer> arr) {
        // Call qs method to start the sorting process
        qs(arr, 0, arr.size() - 1);

        // Return the sorted list
        return arr;
    }

    public static void main(String args[]) {
        // Create an ArrayList and initialize it with an array of integers
        List<Integer> arr = new ArrayList<>();
        arr = Arrays.asList(new Integer[] { 4, 6, 2, 5, 7, 9, 1, 3 });
        int n = arr.size();

        // Print the original array before sorting
        System.out.println("Before Using Quick Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        // Call the quickSort method to sort the array
        arr = quickSort(arr);

        // Print the sorted array
        System.out.println("After Quick Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
}

/* 
Important Stuff:
1. In partition(),the while (arr.get(i) <= pivot && i <= high - 1) makes sure that upon incrementation of i the array index is not out of bound, if it was for only i <= high and after the i++ we would have got this error of out of bound. Vice-Versa for the other while() 
2. In partition() among the while (arr.get(i) <= pivot && i <= high - 1), the condition (arr.get(i) <= pivot) makes sure that any duplicate element in an array should be in the left part of the pivot.
 */
