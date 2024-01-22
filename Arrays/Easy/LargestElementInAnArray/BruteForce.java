package LargestElementInAnArray;

import java.util.Arrays;

public class BruteForce {
    static void largest(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 0 };
        int n = arr.length;
        largest(arr);
        System.out.println(arr[n - 1]);
    }
}



