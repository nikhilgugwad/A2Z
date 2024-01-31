package Arrays.Medium.RearrangeArrayElementsBySign;

import java.util.ArrayList;

public class BruteForce {

    // Function to rearrange elements in the array based on their sign
    static int[] rearrange_elements_by_sign(int[] arr, int n) {
        // Separate positive and negative numbers into two ArrayLists
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Iterate through the array and categorize elements based on their sign
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                pos.add(arr[i]); // Positive numbers go to the 'pos' ArrayList
            } else {
                neg.add(arr[i]); // Negative numbers go to the 'neg' ArrayList
            }
        }

        // Rearrange the array by alternating positive and negative numbers
        for (int i = 0; i < n / 2; i++) {
            arr[2 * i] = pos.get(i); // Place positive number at even index
            arr[2 * i + 1] = neg.get(i); // Place negative number at odd index
        }

        return arr; // Return the rearranged array
    }

    // Main method to test the rearrange_elements_by_sign function
    public static void main(String[] args) {
        int[] arr = { 1, 2, -4, -5 };
        int n = arr.length;

        // Call the rearrange_elements_by_sign function
        rearrange_elements_by_sign(arr, n);

        // Display the rearranged array
        System.out.print("Array after rearranging the elements : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
