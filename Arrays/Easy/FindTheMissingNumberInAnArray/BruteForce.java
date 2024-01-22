package FindTheMissingNumberInAnArray;

public class BruteForce {

    // Function to find the missing number in the array
    static int missing_number(int[] arr, int N) {

        // Loop through each number from 1 to N
        for (int i = 1; i <= N; i++) {
            int flag = 0;

            // Check if the current number 'i' is present in the array
            for (int j = 0; j < N; j++) {
                if (arr[j] == i) {
                    // If 'i' is found in the array, set the flag and break out of the inner loop
                    flag = 1;
                    break;
                }
            }

            // If 'i' is not found in the array, return it as the missing number
            if (flag == 0)
                return i;
        }

        // If no missing number is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Example array and its length
        int[] arr = { 1, 2, 4, 5 };
        int N = 5;

        // Call the function to find the missing number
        int missingNumber = missing_number(arr, N);

        // Display the result
        if (missingNumber == -1) {
            System.out.println("There are no missing numbers");
        } else {
            System.out.println("The missing number is : " + missingNumber);
        }
    }
}
