package CheckIfAnArrayIsSorted;

public class BruteForce {

    // Function to check if an array is sorted in non-decreasing order
    static boolean isSorted(int[] arr, int n) {
        // Iterate through each element in the array
        for (int i = 0; i < n; i++) {
            // Compare the current element with all elements to its right
            for (int j = i + 1; j < n; j++) {
                // If any element to the right is smaller than the current element,
                // then the array is not sorted
                if (arr[j] < arr[i]) {
                    return false;
                }
            }
        }

        // If no out-of-order elements are found, the array is sorted
        return true;
    }

    public static void main(String[] args) {
        // Test array
        int arr[] = { 1, 2, 3, 4, 5 };

        // Get the length of the array
        int n = arr.length;

        // Print the result of the isSorted function
        System.out.println(isSorted(arr, n));
    }
}
