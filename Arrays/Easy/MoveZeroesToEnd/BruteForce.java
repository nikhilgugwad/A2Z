package MoveZeroesToEnd;

import java.util.ArrayList;

public class BruteForce {

    // Move zeroes to the end using an auxiliary array
    static void move_zeroes_apr1(int[] arr, int n) {
        int start = 0;
        int end = 0;
        int[] temp = new int[n]; // Temporary array to store non-zero elements

        // Copy non-zero elements to temp array
        for (int i = start; i < n; i++) {
            if (arr[start] != 0) {
                temp[end] = arr[start];
                end++;
                start++;
            } else {
                start++;
            }
        }

        // Copy elements from temp array back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    // Move zeroes to the end using ArrayList
    static void move_zeroes_apr2(int[] arr, int n) {
        ArrayList<Integer> temp = new ArrayList<>(); // ArrayList to store non-zero elements

        // Copy non-zero elements to ArrayList
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        int nz = temp.size(); // Number of non-zero elements

        // Copy elements from ArrayList back to original array
        for (int i = 0; i < nz; i++) {
            arr[i] = temp.get(i);
        }

        // Fill the remaining positions with zeroes
        for (int i = nz; i < n; i++) {
            arr[i] = 0;
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

        // Uncomment the desired method to test
        move_zeroes_apr1(arr, n);
        // move_zeroes_apr2(arr, n);

        System.out.print("After moving all zeroes to the end : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
