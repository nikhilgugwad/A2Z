package Patterns;

import java.util.Scanner;

public class HourglassStarPattern {

    // Function to print an hourglass star pattern
    static void printHourglassStarPattern(int n) {
        int initialSpaces = 0;
        
        // Print upper part of the hourglass
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < initialSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            initialSpaces += 2;
            System.out.println();
        }

        // Print lower part of the hourglass
        initialSpaces = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < initialSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            initialSpaces -= 2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter the size of the pattern: ");
        int patternSize = scanner.nextInt();
        printHourglassStarPattern(patternSize);

        // Closing the scanner
        scanner.close();
    }
}
