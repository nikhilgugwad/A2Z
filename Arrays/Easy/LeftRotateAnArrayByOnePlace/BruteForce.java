package LeftRotateAnArrayByOnePlace;

public class BruteForce {
    // Function to rotate the given array to the left by 1 position
    static void left_rotate(int arr[], int n) {
        // Create a temporary array to store the rotated elements
        int temp[] = new int[n];

        // Shift elements to the left by one position
        for (int i = 1; i < n; i++) {
            temp[i - 1] = arr[i];
        }

        // Move the first element to the last position
        temp[n - 1] = arr[0];

        // Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    public static void main(String args[]) {

        // Initialize the array
        int arr[] = { 1, 2, 3, 4, 5 };

        // Store the size of array
        int n = arr.length;

        // Call the solve function to rotate and print the array
        left_rotate(arr, n);
    }
}
