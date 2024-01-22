package FindTheMissingNumberInAnArray;

public class Better {

    // Function to find the missing number in the array
    static int missing_number(int[] arr, int N) {

        // Create an array to act as a hash table to count occurrences of each number
        int hash[] = new int[N + 1];

        // Iterate through the input array to count occurrences of each valid number
        for (int i = 0; i < N - 1; i++) {

            // Check if the current array element is within the valid range [0, N]
            if (arr[i] >= 0 && arr[i] <= N) {
                // Increment the count in the hash table for the current array element
                hash[arr[i]]++;
            }
        }

        // Iterate through the hash table to find the missing number
        for (int i = 1; i <= N; i++) {
            if (hash[i] == 0) {
                // If the count for a number is 0, it is the missing number
                return i;
            }
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
