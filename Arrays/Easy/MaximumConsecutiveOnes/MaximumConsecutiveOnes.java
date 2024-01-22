package MaximumConsecutiveOnes;

public class MaximumConsecutiveOnes {
    // Function to find the maximum consecutive ones in an array
    static int consecutive_ones(int[] arr, int n) {
        int count = 0; // Variable to store the current consecutive ones count
        int maxCount = 0; // Variable to store the maximum consecutive ones count

        // Loop through the array
        for (int i = 0; i < n; i++) {
            // Check if the current element is 0
            if (arr[i] == 0) {
                count = 0; // Reset count if the current element is 0
            } else {
                count++; // Increment count if the current element is 1
            }

            // Update maxCount with the maximum value of count
            maxCount = Math.max(maxCount, count);
        }

        return maxCount; // Return the maximum consecutive ones count
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1 };
        int n = arr.length;
        int max = consecutive_ones(arr, n);

        // Print the result
        System.out.println("The maximum consecutive one's are : " + max);
    }
}
