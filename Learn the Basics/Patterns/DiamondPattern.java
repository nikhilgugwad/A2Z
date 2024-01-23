package Patterns;

import java.util.Scanner;

public class DiamondPattern {

    // Function to print a pyramid pattern
    static void printPyramidPattern(int n) {
        for (int i = 0; i < n; i++) {
            // To print spaces, the formula is n - i - 1
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // To print stars, the formula is 2 * i + 1
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // To print spaces, the formula is n - i - 1
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

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

    // Function to print a diamond pattern
    static void printDiamondPattern(int n) {
        printPyramidPattern(n);
        printInvertedPyramidPattern(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter the size of the patterns: ");
        int patternSize = scanner.nextInt();
        printDiamondPattern(patternSize);

        // Closing the scanner
        scanner.close();
    }
}
