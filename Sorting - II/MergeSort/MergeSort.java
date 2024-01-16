import java.util.ArrayList;

public class MergeSort {

    // Method to merge two halves of the array
    static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array to store merged elements
        int left = low; // starting index of the left half of the array
        int right = mid + 1; // starting index of the right half of the array

        // Storing elements in the temporary array in a sorted manner
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // If elements on the left half are still left
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // If elements on the right half are still left
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // Transferring all elements from temporary array back to the original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    // Method to perform merge sort on the array
    static void merge_sort(int[] arr, int low, int high) {
        if (low >= high)
            return; // Base case: if there is only one element or no element
        int mid = (low + high) / 2; // Calculate the middle index
        merge_sort(arr, low, mid); // Recursively sort the left half
        merge_sort(arr, mid + 1, high); // Recursively sort the right half
        merge(arr, low, mid, high); // Merge the sorted halves
    }

    // Main class
    public static void main(String[] args) {
        int[] arr = { 9, 4, 7, 6, 3, 1, 5 };
        int n = arr.length;
        System.out.print("Before Merge Sort : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        merge_sort(arr, 0, n - 1); // Call mergeSort method to sort the array
        System.out.print("After Merge Sort : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}