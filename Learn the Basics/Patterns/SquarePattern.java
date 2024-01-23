package Patterns;

import java.util.Scanner;

public class SquarePattern {

    // Function to print a square pattern
    static void printSquarePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter the size of the square pattern: ");
        int patternSize = scanner.nextInt();
        printSquarePattern(patternSize);

        // Closing the scanner
        scanner.close();
    }
}
