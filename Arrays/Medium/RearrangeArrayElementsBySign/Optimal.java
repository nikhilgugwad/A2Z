package Arrays.Medium.RearrangeArrayElementsBySign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Optimal {

    // Function to rearrange elements in the array based on their sign
    static ArrayList<Integer> rearrange_elements_by_sign(ArrayList<Integer> arr) {
        int n = arr.size();

        // Initialize a new ArrayList 'ans' with the same size as 'arr' and fill it with
        // zeros
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));

        // Initialize indices for positive and negative numbers in the result array
        int posIndex = 0, negIndex = 1;

        // Iterate through the input array and rearrange elements based on their sign
        for (int i = 0; i < n; i++) {
            if (arr.get(i) < 0) {
                ans.set(negIndex, arr.get(i)); // Place negative number at odd index
                negIndex += 2; // Move to the next odd index for the next negative number
            } else {
                ans.set(posIndex, arr.get(i)); // Place positive number at even index
                posIndex += 2; // Move to the next even index for the next positive number
            }
        }

        return ans; // Return the rearranged ArrayList
    }

    // Main method to test the rearrange_elements_by_sign function
    public static void main(String[] args) {
        // Initialize an ArrayList with the input values
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, -4, -5));

        // Call the rearrange_elements_by_sign function
        ArrayList<Integer> ans = rearrange_elements_by_sign(arr);

        // Display the result after rearranging elements based on signs
        System.out.println("After rearranging elements based on signs : " + ans);
    }
}
