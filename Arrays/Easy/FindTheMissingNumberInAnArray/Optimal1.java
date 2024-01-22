package FindTheMissingNumberInAnArray;

public class Optimal1 {

    // Function to find the missing number in the array using the sum of natural
    // numbers formula
    static int missing_number(int[] arr, int N) {
        // Calculate the sum of natural numbers up to N
        int sumN = (N * (N + 1)) / 2;

        // Calculate the sum of elements in the array
        int sumArray = 0;
        for (int i = 0; i < N - 1; i++) {
            sumArray += arr[i];
        }

        // The missing number is the difference between the sum of natural numbers and
        // the sum of the array
        int missingNumber = sumN - sumArray;

        // Return the missing number
        return missingNumber;
    }

    public static void main(String[] args) {
        // Example array and its length
        int[] arr = { 1, 2, 4, 5 };
        int N = 5;

        // Call the function to find the missing number
        int missingNumber = missing_number(arr, N);

        // Display the result
        System.out.println("The missing number is : " + missingNumber);
    }
}
