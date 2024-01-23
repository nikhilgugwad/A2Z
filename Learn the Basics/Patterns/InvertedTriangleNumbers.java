package Patterns;

import java.util.Scanner;

public class InvertedTriangleNumbers {

    // Function to print an inverted triangle numbers pattern
    static void printInvertedTriangleNumbers(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter the size of the inverted triangle numbers pattern: ");
        int patternSize = scanner.nextInt();
        printInvertedTriangleNumbers(patternSize);

        // Closing the scanner
        scanner.close();
    }
}
