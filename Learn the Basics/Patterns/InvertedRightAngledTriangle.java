package Patterns;

import java.util.Scanner;

public class InvertedRightAngledTriangle {

    // Function to print an inverted right-angled triangle
    static void printInvertedRightAngledTriangle(int n) {
        for (int i = n; i > 0; i--) {
            // to print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // to print stars
            for (int j = 1; j <= i; j++) {
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
        printInvertedRightAngledTriangle(patternSize);

        // Closing the scanner
        scanner.close();
    }
}
