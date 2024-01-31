package Arrays.Medium.SortAnArrayOf0s1sAnd2s;

import java.util.ArrayList;
import java.util.Arrays;

public class Better {

    // Function to sort an ArrayList of integers containing only 0s, 1s, and 2s
    static void sort_array(ArrayList<Integer> arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        // Count occurrences of 0s, 1s, and 2s in the ArrayList
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0)
                count0++;
            else if (arr.get(i) == 1)
                count1++;
            else
                count2++;
        }

        // Update the ArrayList with sorted values
        for (int i = 0; i < count0; i++)
            arr.set(i, 0);
        for (int i = count0; i < count0 + count1; i++)
            arr.set(i, 1);
        for (int i = count0 + count1; i < count0 + count1 + count2; i++)
            arr.set(i, 2);
    }

    public static void main(String[] args) {
        // Initializing an ArrayList with values 0, 2, 1, 2, 0, 1
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] { 0, 2, 1, 2, 0, 1 }));

        // Displaying the ArrayList before sorting
        System.out.println("Before sorting : " + arr);

        // Sorting the ArrayList using the provided function
        sort_array(arr);

        // Displaying the ArrayList after sorting
        System.out.println("After sorting : " + arr);
    }
}
