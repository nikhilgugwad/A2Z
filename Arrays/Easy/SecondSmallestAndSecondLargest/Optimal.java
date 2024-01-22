package SecondSmallestAndSecondLargest;

public class Optimal {

    // Function to find the second smallest element in an array
    static int second_smallest(int[] arr, int n) {
        // If the array has less than 2 elements, there is no second smallest
        if (n < 2) {
            return -1;
        }

        // Initialize variables to track the smallest and second smallest elements
        int small = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;
        int i;

        // Iterate through the array to find the smallest and second smallest elements
        for (i = 0; i < n; i++) {
            // Update variables if the current element is smaller than the smallest or the
            // second smallest
            if (arr[i] < small) {
                second_smallest = small;
                small = arr[i];
            } else if (arr[i] < second_smallest && arr[i] != small) {
                second_smallest = arr[i];
            }
        }
        return second_smallest;
    }

    // Function to find the second largest element in an array
    static int second_largest(int[] arr, int n) {
        // If the array has less than 2 elements, there is no second largest
        if (n < 2) {
            return -1;
        }

        // Initialize variables to track the largest and second largest elements
        int large = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        int i;

        // Iterate through the array to find the largest and second largest elements
        for (i = 0; i < n; i++) {
            // Update variables if the current element is larger than the largest or the
            // second largest
            if (arr[i] > large) {
                second_largest = large;
                large = arr[i];
            } else if (arr[i] > second_largest && arr[i] != large) {
                second_largest = arr[i];
            }
        }
        return second_largest;
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = { 1, 2, 4, 7, 7, 5 };
        int n = arr.length;

        // Find and print the second smallest and second largest elements
        int ss = second_smallest(arr, n);
        int sl = second_largest(arr, n);
        System.out.println("The second smallest element in an array is : " + ss);
        System.out.println("The second largest element in an array is : " + sl);
    }
}
