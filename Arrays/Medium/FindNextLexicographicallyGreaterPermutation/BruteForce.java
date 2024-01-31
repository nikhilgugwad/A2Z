import java.util.Arrays;

public class BruteForce {

    // Function to generate the next lexicographically greater permutation of an
    // array
    static void next_permutation(int[] arr) {
        // Make a copy of the original array
        int[] originalArr = Arrays.copyOf(arr, arr.length);
        // Sort the copy to compare with the original array
        Arrays.sort(originalArr);

        // Loop until the next permutation is found
        do {
            // If the current permutation is different from the original, break the loop
            if (!Arrays.equals(arr, originalArr)) {
                // Copy the current permutation to the original array and break the loop
                System.arraycopy(arr, 0, arr, 0, arr.length);
                break;
            }
        } while (nextPermutation(arr)); // Generate the next permutation

        // If no next permutation is found, sort the array to its initial state
        if (Arrays.equals(arr, originalArr)) {
            Arrays.sort(arr);
        }
    }

    // Function to find the next permutation of an array
    static boolean nextPermutation(int[] arr) {
        // Find the largest index i such that arr[i] < arr[i+1]
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // If such an index exists
        if (i >= 0) {
            // Find the largest index j such that arr[j] > arr[i]
            int j = arr.length - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }

            // Swap arr[i] and arr[j]
            swap(arr, i, j);
            // Reverse the suffix starting from index i+1
            reverse(arr, i + 1);
            return true;
        }

        // If no such index exists, return false (no next permutation)
        return false;
    }

    // Function to swap two elements in an array
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to reverse a subarray starting from a given index
    static void reverse(int[] arr, int start) {
        int i = start, j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1 };
        System.out.println("Original Array: " + Arrays.toString(arr));
        next_permutation(arr); // Generate the next permutation
        System.out.println("Next Permutation: " + Arrays.toString(arr));
    }
}
