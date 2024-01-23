package Patterns;

import java.util.Scanner;

public class InvertedTrianglePattern {

    // Function to print an inverted triangle pattern
    static void printInvertedTrianglePattern(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter the size of the inverted triangle pattern: ");
        int patternSize = scanner.nextInt();
        printInvertedTrianglePattern(patternSize);

        // Closing the scanner
        scanner.close();
    }
}
