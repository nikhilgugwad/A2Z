public class RecursiveBubbleSort {

     // Recursive Bubble Sort method
    static void bubble_sort(int[] arr, int n) {
        // Base case: If range is 1, the array is already sorted
        if (n == 1)
            return;

         // One pass of Bubble Sort
        for (int j = 0; j <= n - 2; j++) {

            // Compare adjacent elements and swap if necessary
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        // Range reduced after recursion: Call bubble_sort with reduced range (n - 1)
        bubble_sort(arr, n - 1);
    }

    public static void main(String[] args) {

        // Example array
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        int n = arr.length;

         // Print the original array before sorting
        System.out.println("Before Recursive Bubble Sort");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Call the recursive bubble_sort method to sort the array
        bubble_sort(arr, n);

        // Print the sorted array
        System.out.println("After Recursive Bubble Sort");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
