package Patterns;

import java.util.Scanner;

public class PyramidPattern {

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter the size of the pyramid pattern: ");
        int patternSize = scanner.nextInt();
        printPyramidPattern(patternSize);

        // Closing the scanner
        scanner.close();
    }
}
