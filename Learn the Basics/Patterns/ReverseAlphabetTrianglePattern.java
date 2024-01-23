package Patterns;

import java.util.Scanner;

public class ReverseAlphabetTrianglePattern {

    // Function to print a reverse alphabet triangle pattern
    static void printReverseAlphabetTrianglePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int ch = 'A'; ch < 'A' + (n - i); ch++) {
                System.out.print((char) ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter the size of the pattern: ");
        int patternSize = scanner.nextInt();
        printReverseAlphabetTrianglePattern(patternSize);

        // Closing the scanner
        scanner.close();
    }
}
