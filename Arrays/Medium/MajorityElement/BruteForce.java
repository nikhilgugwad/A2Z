package Arrays.Medium.MajorityElement;

public class BruteForce {

    // Function to find the majority element using brute-force approach
    static int max_occurrence(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int count = 0;

            // Count occurrences of arr[i] in the array
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // If the count is greater than half the array length, arr[i] is the majority
            // element
            if (count > n / 2) {
                return arr[i];
            }
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
