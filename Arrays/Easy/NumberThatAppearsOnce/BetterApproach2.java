package NumberThatAppearsOnce;

import java.util.HashMap;
import java.util.Map;

public class BetterApproach2 {

    // Function to find the number that appears only once in the array
    static int single_occurrence(int[] arr, int n) {
        // Create a HashMap to store the count of each element in the array
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the occurrences of each element in the array
        for (int i = 0; i < n; i++) {
            // If the key is not present, set the default count to 0, then increment by 1
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Iterate through the HashMap to find the first element with count equal to 1
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // If no unique number is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 1, 2 };
        int n = arr.length;

        // Find the number that appears only once
        int occurrence = single_occurrence(arr, n);

        // Print the result
        if (occurrence != -1)
            System.out.println("Number that is appearing only once in an array is : " + occurrence);
        else
            System.out.println("There are no numbers that appear only once");
    }
}
