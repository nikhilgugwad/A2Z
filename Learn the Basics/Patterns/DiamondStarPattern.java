package Patterns;

import java.util.Scanner;

public class DiamondStarPattern {

    // Function to print a diamond star pattern
    static void printDiamondStarPattern(int n) {
        int spaces = 2 * n - 2;
        for (int i = 1; i < 2 * n; i++) {
            int stars = (i <= n) ? i : 2 * n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n) {
                spaces -= 2;
            } else {
                spaces += 2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter the size of the pattern: ");
        int patternSize = scanner.nextInt();
        printDiamondStarPattern(patternSize);

        // Closing the scanner
        scanner.close();
    }
}
