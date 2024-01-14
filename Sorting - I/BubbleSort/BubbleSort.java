import java.util.*;

public class BubbleSort {
    static void bubble_sort(int[] arr, int n) {
        // Outer loop runs n-1 times
        for (int i = n - 1; i >= 0; i--) {
            // Inner loop runs from the beginning of the array up to i
            for (int j = 0; j <= i - 1; j++) {
                // Compare adjacent elements and swap if they are in the wrong order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Output the sorted array after the completion of the sorting process
        System.out.print("After Bubble Sort : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // Sample array to be sorted
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        int length = arr.length;

        // Output the original array before sorting
        System.out.print("Before Bubble Sort : ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Call the bubble_sort method to sort the array
        bubble_sort(arr, length);
    }
}
