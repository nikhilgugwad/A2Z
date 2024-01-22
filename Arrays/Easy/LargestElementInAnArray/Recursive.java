package LargestElementInAnArray;

public class Recursive {
    static int largest(int[] arr, int startIndex, int endIndex) {

        // Base case: If there is only one element in the array
        if (startIndex == endIndex) {
            return arr[startIndex];
        }

        // Recursive case: Divide the array and find the maximum in the subarrays
        int mid = (startIndex + endIndex) / 2;
        int maxLeft = largest(arr, startIndex, mid);
        int maxright = largest(arr, mid + 1, endIndex);

        // Compare the maximum elements in the left and right subarrays
        return Math.max(maxLeft, maxright);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 0 };
        int result = largest(arr, 0, arr.length - 1);
        System.out.println(result);
    }
}