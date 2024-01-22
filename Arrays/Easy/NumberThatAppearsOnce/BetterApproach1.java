package NumberThatAppearsOnce;

public class BetterApproach1 {

    // Function to find the number that appears only once in the array
    static int single_occurrence(int[] arr, int n) {
        // Find the maximum element in the array
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

        // Create a hash array to store the count of each element in the array
        // The size is set to (max + 1) to include 0 and values in the array as indices
        // (max + 1) makes sure that the index of max value in the hash array is also
        // included.
        int[] hash = new int[max + 1];

        // Count the occurrences of each element in the array
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        // Iterate through the array to find the first element with count equal to 1
        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1) {
                return arr[i];
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
