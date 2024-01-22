package SecondSmallestAndSecondLargest;

public class Better {

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

        // Initialize variables to track the smallest, second smallest, largest, and
        // second largest elements
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int i;

        // Iterate through the array to find the smallest and largest elements
        for (i = 0; i < n; i++) {
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }

        // Iterate through the array to find the second smallest and second largest
        // elements
        for (i = 0; i < n; i++) {
            // Update second_small if the current element is smaller than second_small and
            // not equal to the smallest
            if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }

            // Update second_large if the current element is larger than second_large and
            // not equal to the largest
            if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }

        // Print the result
        System.out.println("The second smallest element in an array is : " + second_small);
        System.out.println("The second largest element in an array is : " + second_large);
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = { 1, 2, 4, 6, 7, 5 };
        int n = arr.length;

        // Print the original array
        System.out.print("The Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Call the function to find second smallest and second largest
        second_smallest_largest(arr, n);
    }
}
