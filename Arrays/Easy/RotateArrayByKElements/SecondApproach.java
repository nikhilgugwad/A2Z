package RotateArrayByKElements;

// Using ” Reversal Algorithm “
public class SecondApproach {

    // Function to reverse the elements of the array between start and end indices
    static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate the array to the right by K elements using the Reversal
    // Algorithm
    static void rotate_right(int[] arr, int n, int k) {
        // Reverse the first part of the array (from 0 to n - k - 1)
        reverse(arr, 0, n - k - 1);
        // Reverse the second part of the array (from n - k to n - 1)
        reverse(arr, n - k, n - 1);
        // Reverse the entire array to complete the rotation
        reverse(arr, 0, n - 1);
    }

    // Function to rotate the array to the left by K elements using the Reversal
    // Algorithm
    static void rotate_left(int[] arr, int n, int k) {
        // Reverse the first part of the array (from k to n - 1)
        reverse(arr, k, n - 1);
        // Reverse the second part of the array (from 0 to k - 1)
        reverse(arr, 0, k - 1);
        // Reverse the entire array to complete the rotation
        reverse(arr, 0, n - 1);
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

        // Right rotate the array by K elements using the Reversal Algorithm
        rotate_right(arr, n, k);

        // Uncomment the line below to left rotate the array by K elements
        // rotate_left(arr, n, k);

        System.out.print("After right rotating an array by K elements : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
