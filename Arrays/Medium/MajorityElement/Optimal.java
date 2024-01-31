package Arrays.Medium.MajorityElement;

public class Optimal {

    // Function to find the majority element using the optimal approach
    static int max_occurrence(int[] arr, int n) {
        // Initialize variables to track the current candidate and its count
        int count = 0;
        int element = 0;

        // Find the candidate for the majority element
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                // If count is zero, set the current element as the candidate
                element = arr[i];
                count++;
            } else if (arr[i] == element) {
                // If the current element is the same as the candidate, increment the count
                count++;
            } else {
                // If the current element is different, decrement the count
                count--;
            }
        }

        // Count occurrences of the candidate to confirm it as the majority element
        int countAgain = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                countAgain++;
            }
        }

        // If the candidate has more than half the occurrences, it is the majority
        // element
        if (countAgain > n / 2) {
            return element;
        }

        // If no majority element is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr = { 2, 2, 1, 1, 1, 2, 1 };
        int n = arr.length;

        // Find the majority element
        int ans = max_occurrence(arr, n);

        // Print the result
        System.out.println("Majority element: " + ans);
    }
}
