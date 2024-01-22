package NumberThatAppearsOnce;

public class Optimal {

    // Function to find the number that appears only once in the array using XOR
    static int single_occurrence(int[] arr, int n) {
        // Initialize XOR variable to store the result
        int xor = 0;

        // Perform XOR operation on all elements in the array
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }

        // The final value of XOR will be the number that appears only once
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 1, 2 };
        int n = arr.length;

        // Find the number that appears only once using XOR
        int occurrence = single_occurrence(arr, n);

        // Print the result
        if (occurrence != 0)
            System.out.println("Number that is appearing only once in an array is : " + occurrence);
        else
            System.out.println("There are no numbers that appear only once");
    }
}
