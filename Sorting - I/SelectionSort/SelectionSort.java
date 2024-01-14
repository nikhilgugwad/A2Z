import java.util.*;

public class SelectionSort {
    static void selection_sort(int[] arr, int n) {
        // Outer loop to iterate over each element of the array
        for (int i = 0; i < n - 1; i++) {
            // Assume the current index is the minimum
            int min = i;
            // Inner loop to find the minimum element in the unsorted portion of the array
            for (int j = i + 1; j < n; j++) {
                // Compare the current element with the assumed minimum
                if (arr[j] < arr[min]) {
                    // If a smaller element is found, update the index of the minimum
                    min = j;
                }

            }
            // Swap the found minimum element with the first element of the unsorted portion
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        // Output the sorted array after the completion of the sorting process
        System.out.print("After Selection Sort : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // Sample array to be sorted
        int[] arr = { 3, 6, 1, 19, 5, 21 };
        int length = arr.length;

        // Output the original array before sorting
        System.out.print("Before Selection Sort : ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Call the selection_sort method to sort the array
        selection_sort(arr, length);
    }
}
