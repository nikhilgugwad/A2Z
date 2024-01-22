package NumberThatAppearsOnce;

public class BruteForce {

    // Function to find the number that appears only once in the array
    static int single_occurrence(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int occurrence = 0;

            // Count the occurrences of the current number in the array
            for (int j = 0; j < n; j++) {
                if (arr[j] == num) {
                    occurrence++;
                }
            }

            // If the current number appears only once, return it
            if (occurrence == 1)
                return num;
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
