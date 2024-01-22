// LinearSearch class for performing linear search in an array
package LinearSearch;

public class LinearSearch {

    // Function to perform linear search
    // Parameters:
    // - arr: The array in which search is performed
    // - n: The number of elements in the array
    // - num: The element to be searched
    // Returns:
    // - The index of the element if found, otherwise -1
    static int linear_search(int[] arr, int n, int num) {
        int i;

        // Iterate through the array elements
        for (i = 0; i < n; i++) {
            // Check if the current element is equal to the target element
            if (arr[i] == num)
                return i; // Return the index if found
        }

        return -1; // Return -1 if the element is not found in the array
    }

    public static void main(String[] args) {
        // Example usage of linear_search function
        int[] arr = { 1, 2, 1, 4, 5 };
        int n = arr.length;
        int num = 3;

        // Call linear_search to find the index of 'num' in the array 'arr'
        int index = linear_search(arr, n, num);

        // Print the result (index) to the console
        System.out.println(index);
    }
}
