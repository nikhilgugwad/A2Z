package Patterns;

import java.util.Scanner;

public class TrianglePattern {

    // Function to print a triangle pattern
    static void printTrianglePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter the size of the triangle pattern: ");
        int patternSize = scanner.nextInt();
        printTrianglePattern(patternSize);

        // Closing the scanner
        scanner.close();
    }
}
