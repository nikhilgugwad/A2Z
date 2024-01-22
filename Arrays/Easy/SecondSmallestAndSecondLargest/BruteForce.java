package SecondSmallestAndSecondLargest;

import java.util.Arrays;

public class BruteForce {

    // Function to find the second smallest and second largest elements in an array
    static void second_smallest_largest(int[] arr, int n) {

        // If the array has less than 2 elements, there is no second smallest or second
        // largest
        if (n == 0 || n == 1) {
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Print the second smallest element
        System.out.print("The second smallest element is " + arr[1]);
        System.out.println();

        // Print the second largest element
        System.out.print("The second largest element is " + arr[n - 2]);
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = { 2, 5, 1, 3, 0 };
        int n = arr.length;

        // Call the function to find second smallest and second largest
        second_smallest_largest(arr, n);
    }
}
