package Patterns;

import java.util.Scanner;

public class InvertedPyramidNumberPattern {

    // Function to print an inverted pyramid number pattern
    static void printInvertedPyramidNumberPattern(int n) {
        int spaces = 2 * (n - 1);

        for (int i = 1; i <= n; i++) {

            // for printing numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // for printing spaces in each row
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // for printing numbers in each row
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }

            System.out.println();
            spaces -= 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter the size of the pattern: ");
        int patternSize = scanner.nextInt();
        printInvertedPyramidNumberPattern(patternSize);

        // Closing the scanner
        scanner.close();
    }
}
