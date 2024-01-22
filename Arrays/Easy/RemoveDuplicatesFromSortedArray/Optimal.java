package RemoveDuplicatesFromSortedArray;

public class Optimal {

    // Function to remove duplicates from the sorted array in-place
    static int remove_duplicates(int[] arr) {
        // Initialize the index i to 0
        int i = 0;

        // Iterate through the array starting from the second element (j = i + 1)
        for (int j = i + 1; j < arr.length; j++) {
            // Check if the current element is different from the previous unique element
            if (arr[j] != arr[i]) {
                // Increment i to move to the next position for a unique element
                i++;

                // Update the array at index i with the current unique element
                arr[i] = arr[j];
            }
        }

        // The length of the unique elements is (i + 1), as the array is zero-indexed
        return i + 1;
    }

    public static void main(String[] args) {
        // Example array with duplicates (sorted array)
        int arr[] = { 1, 1, 2, 2, 2, 3, 3 };

        // Display the original array
        System.out.print("Original array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Call the function to remove duplicates and get the count of unique elements
        int k = remove_duplicates(arr);

        // Display the array after removing duplicates
        System.out.print("After removing duplicates : ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
