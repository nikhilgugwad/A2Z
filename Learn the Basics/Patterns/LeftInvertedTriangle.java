package Patterns;

import java.util.Scanner;

public class LeftInvertedTriangle {

    // Function to print an inverted triangle
    static void printInvertedTriangle(int n) {
        for (int i = 1; i < n; i++) {
            int spaces = n - i;

            // Print spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter the size of the pattern: ");
        int patternSize = scanner.nextInt();
        printInvertedTriangle(patternSize);

        // Closing the scanner
        scanner.close();
    }
}
