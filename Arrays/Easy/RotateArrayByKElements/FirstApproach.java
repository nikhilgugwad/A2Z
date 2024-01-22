package RotateArrayByKElements;

// Using a temp array 
public class FirstApproach {

    // Function to rotate the array to the right by K elements
    static void rotate_right(int[] arr, int n, int k) {
        if (n == 0) {
            return;
        }

        // Ensure k is within the array length
        k = k % n;

        if (k > n) {
            return; // If k is greater than n, no rotation needed
        }

        // Create a temporary array to store the last k elements
        int[] temp = new int[k];
        for (int i = n - k; i < n; i++) {
            temp[i - n + k] = arr[i];
        }

        // Shift the remaining elements to the right
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        // Copy back the elements from the temporary array to the beginning
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }

    // Function to rotate the array to the left by K elements
    static void rotate_left(int[] arr, int n, int k) {
        if (n == 0) {
            return;
        }

        // Ensure k is within the array length
        k = k % n;

        if (k > n) {
            return; // If k is greater than n, no rotation needed
        }

        // Create a temporary array to store the first k elements
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // Shift the remaining elements to the left
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        // Copy back the elements from the temporary array to the end
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int k = 2;

        System.out.print("Original Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Right rotate the array by K elements
        rotate_right(arr, n, k);

        System.out.print("After right rotating an array by K elements : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
