package FindTheMissingNumberInAnArray;

public class Optimal2 {

    // Function to find the missing number in the array using bitwise XOR
    static int missing_number(int[] arr, int N) {
        // Initialize two XOR variables
        int xor1 = 0, xor2 = 0;

        // Perform XOR operation on array elements and natural numbers up to N
        for (int i = 0; i < N - 1; i++) {
            xor2 = xor2 ^ arr[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); // XOR of natural numbers up to N
        }

        xor1 = xor1 ^ N; // XOR of N (the size of the array + 1)

        // The missing number is the XOR of the two XOR results
        int missingNumber = (xor1 ^ xor2);

        // Return the missing number
        return missingNumber;
    }

    public static void main(String[] args) {
        // Example array and its length
        int[] arr = { 1, 2, 4, 5 };
        int N = 5;

        // Call the function to find the missing number
        int ans = missing_number(arr, N);

        // Display the result
        System.out.println("The missing number is: " + ans);
    }
}
