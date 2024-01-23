package Patterns;

import java.util.Scanner;

public class AlphabetTrianglePatternReverse {

    // Function to print a reverse alphabet triangle pattern
    static void printAlphabetTrianglePatternReverse(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter the size of the pattern: ");
        int patternSize = scanner.nextInt();
        printAlphabetTrianglePatternReverse(patternSize);

        // Closing the scanner
        scanner.close();
    }
}
