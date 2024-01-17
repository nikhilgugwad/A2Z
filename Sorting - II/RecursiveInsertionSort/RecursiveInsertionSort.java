import java.util.*;

public class RecursiveInsertionSort {

    // Function to perform recursive insertion sort
    static void insertion_sort(int[] arr, int i, int n) {

        // Base Case: If i reaches the end of the array, return.
        if (i == n)
            return;

        // Set a pointer j to the current index i
        int j = i;

        // Move the element at index j to its correct position in the sorted array
        // by comparing it with the elements to its left.
        while (j > 0 && arr[j - 1] > arr[j]) {

            // Swap arr[j] and arr[j - 1] if the element to the left is greater
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
            j--;
        }

        // Recursively call insertion_sort for the next index i
        insertion_sort(arr, i + 1, n);
    }

    public static void main(String[] args) {

        // Sample array for testing
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        int n = arr.length;

        // Display the array before using insertion sort
        System.out.println("Before Insertion Sort : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Call the insertion_sort function to sort the array recursively
        insertion_sort(arr, 0, n);

        // Display the array after insertion sort
        System.out.println("After Insertion Sort : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
