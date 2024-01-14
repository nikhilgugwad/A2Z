import java.util.*;

public class InsertionSort {

    // Method to perform Insertion Sort on an array
    static void insertion_sort(int[] arr, int n) {

        // Outer loop iterates through each element in the array
        for (int i = 0; i <= n - 1; i++) {
            int j = i;

            // Inner loop checks and swaps elements until the correct position is found
            while (j > 0 && arr[j - 1] > arr[j]) {

                // Swap elements if the previous element is greater than the current element
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--; // Move to the previous index for further comparisons
            }

        }

        // Output the sorted array after the completion of the sorting process
        System.out.print("After Insertion Sort : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        // Sample array to be sorted
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        int length = arr.length;

        // Output the original array before sorting
        System.out.print("Before Insertion Sort : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Call the insertion_sort method to sort the array
        insertion_sort(arr, length);
    }
}
