package Patterns;

import java.util.Scanner;

public class IncreasingAsterisksPattern {

    // Function to print an increasing asterisks pattern
    static void printIncreasingAsterisksPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter the size of the pattern: ");
        int patternSize = scanner.nextInt();
        printIncreasingAsterisksPattern(patternSize);

        // Closing the scanner
        scanner.close();
    }
}
