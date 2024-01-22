package LeftRotateAnArrayByOnePlace;

public class Optimal {

    // Function to left rotate the given array by one position using while loop
    static void left_rotate(int[] arr, int n) {
        // If the array has only one element, no rotation is needed
        if (n == 1) {
            return;
        }

        // Store the first element to rotate it to the last position
        int k = arr[0];

        // Initialize start index and end index for array traversal
        int si = 0;
        int ei = n - 1;

        // Iterate through the array to perform rotation
        while (si <= ei) {
            // If it's the last element, set it to the stored first element
            if (si == ei) {
                arr[si] = k;
                si++;
            } else {
                // Shift each element to the left by one position
                arr[si] = arr[si + 1];
                si++;
            }
        }
    }

    // Function to rotate the given array to the left by one position using for loop
    static void solve_left_rotate(int arr[], int n) {
        int temp = arr[0]; // Store the first element of the array in a variable

        // Shift each element to the left by one position
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[n - 1] = temp; // Assign the value of the variable to the last index

        // Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // Sample array
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        // Get the length of the array
        int n = arr.length;

        // Call the left_rotate function
        left_rotate(arr, n);

        // Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
