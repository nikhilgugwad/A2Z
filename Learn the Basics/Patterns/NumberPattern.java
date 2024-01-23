package Patterns;

import java.util.Scanner;

public class NumberPattern {

    // Function to print a number pattern
    static void printNumberPattern(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int bottom = (2 * n - 2) - i;

                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(right, left)));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter the size of the pattern: ");
        int patternSize = scanner.nextInt();
        printNumberPattern(patternSize);

        // Closing the scanner
        scanner.close();
    }
}
