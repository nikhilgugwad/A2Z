package MoveZeroesToEnd;

public class Optimal {

    // Move zeroes to the end in an optimal way
    static void move_zeroes(int[] arr, int n) {
        int j = -1; // Variable to store the position of the first zero

        // Find the position of the first zero in the array
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        // If there are no zeroes, no need to perform any swaps
        if (j == -1)
            return;

        // Iterate from the position after the first zero to the end of the array
        for (int i = j + 1; i < n; i++) {
            // If the current element is not zero, swap it with the first zero and move the
            // 'j' pointer
            if (arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
        int n = arr.length;
        System.out.print("Original array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        move_zeroes(arr, n);

        System.out.print("After moving all zeroes to the end : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
