package Arrays.Medium.SortAnArrayOf0s1sAnd2s;

import java.util.ArrayList;
import java.util.Arrays;

public class Optimal {

    // Function to sort an ArrayList of integers containing only 0s, 1s, and 2s
    // using Dutch National Flag algorithm
    static void sort_array(ArrayList<Integer> arr) {
        int low = 0, mid = 0, high = arr.size() - 1;

        // Loop until mid crosses the high index
        while (mid <= high) {
            // If the element at mid is 0, swap it with the element at low and increment
            // both low and mid
            if (arr.get(mid) == 0) {
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);

                low++;
                mid++;
            }
            // If the element at mid is 1, just increment mid (no swapping needed for 1)
            else if (arr.get(mid) == 1) {
                mid++;
            }
            // If the element at mid is 2, swap it with the element at high and decrement
            // high
            else {
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);

                high--;
            }
        }
    }

    public static void main(String[] args) {
        // Initializing an ArrayList with values 0, 2, 1, 2, 0, 1
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] { 0, 2, 1, 2, 0, 1 }));

        // Displaying the ArrayList before sorting
        System.out.println("Before sorting : " + arr);

        // Sorting the ArrayList using the Dutch National Flag algorithm
        sort_array(arr);

        // Displaying the ArrayList after sorting
        System.out.println("After sorting : " + arr);
    }
}
