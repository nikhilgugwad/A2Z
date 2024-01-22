package CheckIfAnArrayIsSorted;

public class Optimal {

    // Function to check if an array is sorted in non-decreasing order
    static boolean isSorted(int[] arr, int n) {
        // Iterate through each element starting from the second element
        for (int i = 1; i < n; i++) {
            // Compare the current element with its previous element
            if (arr[i] < arr[i - 1]) {
                // If any element is smaller than its previous element, the array is not sorted
                return false;
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
