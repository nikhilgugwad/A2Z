package Arrays.Medium.RearrangeArrayElementsBySign;

import java.util.ArrayList;
import java.util.Arrays;

public class Variety2 {

    // Function to rearrange elements in the ArrayList based on their sign
    static ArrayList<Integer> rearrange_elements_by_sign(ArrayList<Integer> arr, int n) {
        // Separate positive and negative numbers into two ArrayLists
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Iterate through the ArrayList and categorize elements based on their sign
        for (int i = 0; i < n; i++) {
            if (arr.get(i) > 0) {
                pos.add(arr.get(i)); // Positive numbers go to the 'pos' ArrayList
            } else {
                neg.add(arr.get(i)); // Negative numbers go to the 'neg' ArrayList
            }
        }

        // Rearrange the ArrayList by alternating positive and negative numbers
        if (neg.size() > pos.size()) {
            for (int i = 0; i < pos.size(); i++) {
                arr.set(2 * i, pos.get(i)); // Place positive number at even index
                arr.set(2 * i + 1, neg.get(i)); // Place negative number at odd index
            }

            // Fill the remaining positions with the remaining negative numbers
            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                arr.set(index, neg.get(i));
                index++;
            }
        } else {
            for (int i = 0; i < neg.size(); i++) {
                arr.set(2 * i, pos.get(i)); // Place positive number at even index
                arr.set(2 * i + 1, neg.get(i)); // Place negative number at odd index
            }

            // Fill the remaining positions with the remaining positive numbers
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                arr.set(index, pos.get(i));
                index++;
            }
        }

        return arr; // Return the rearranged ArrayList
    }

    // Main method to test the rearrange_elements_by_sign function
    public static void main(String[] args) {
        // Initialize an ArrayList with the input values
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, -4, -5, 3, 4));
        int n = arr.size();

        // Call the rearrange_elements_by_sign function
        arr = rearrange_elements_by_sign(arr, n);

        // Display the result after rearranging elements based on signs
        System.out.println("Array after rearranging the elements : " + arr);
    }
}
