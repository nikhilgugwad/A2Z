package Patterns;

import java.util.Scanner;

public class IncreasingNumberPattern {

    // Function to print an increasing number pattern
    static void printIncreasingNumberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter the size of the pattern: ");
        int patternSize = scanner.nextInt();
        printIncreasingNumberPattern(patternSize);

        // Closing the scanner
        scanner.close();
    }
}
