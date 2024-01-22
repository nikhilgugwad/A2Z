package RemoveDuplicatesFromSortedArray;

import java.util.HashSet;

public class BruteForce {

    // Function to remove duplicates from the array using a HashSet
    static int remove_duplicates(int[] arr) {
        // Create a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();

        // Iterate through the array and add each element to the HashSet
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        // Get the size of the HashSet, which represents the number of unique elements
        int k = set.size();

        // Reset the array index and iterate through the HashSet to update the array
        // with unique elements
        int j = 0;
        for (int x : set) {
            arr[j++] = x;
        }

        // Return the count of unique elements
        return k;
    }

    public static void main(String[] args) {
        // Example array with duplicates
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
