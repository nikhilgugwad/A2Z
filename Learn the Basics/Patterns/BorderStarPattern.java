package Patterns;

import java.util.Scanner;

public class BorderStarPattern {

    // Function to print a border star pattern
    static void printBorderStarPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter the size of the pattern: ");
        int patternSize = scanner.nextInt();
        printBorderStarPattern(patternSize);

        // Closing the scanner
        scanner.close();
    }
}
