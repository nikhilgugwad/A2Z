package Patterns;

import java.util.Scanner;

public class TriangularStarPattern {

    // Function to print a triangular star pattern
    static void printTriangularStarPattern(int n) {
        for (int i = 1; i < 2 * n; i++) {
            int stars = (i <= n) ? i : 2 * n - i;
            for (int j = 0; j < stars; j++) {
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
        printTriangularStarPattern(patternSize);

        // Closing the scanner
        scanner.close();
    }
}
