package Patterns;

import java.util.Scanner;

public class InvertedPyramid {

    // Function to print an inverted pyramid pattern
    static void printInvertedPyramidPattern(int n) {
        for (int i = 0; i < n; i++) {
            // To print spaces, the formula is i = j
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // To print stars, the formula is 2n - (2 * i + 1)
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }

            // To print spaces, the formula is i = j
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter the size of the inverted pyramid pattern: ");
        int patternSize = scanner.nextInt();
        printInvertedPyramidPattern(patternSize);

        // Closing the scanner
        scanner.close();
    }
}
