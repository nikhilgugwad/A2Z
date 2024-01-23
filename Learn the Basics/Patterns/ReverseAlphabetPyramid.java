package Patterns;

import java.util.Scanner;

public class ReverseAlphabetPyramid {

    // Function to print a reverse alphabet pyramid pattern
    static void printReverseAlphabetPyramidPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int ch = 'E' - i; ch <= 'E'; ch++) {
                System.out.print((char) ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter the size of the pattern: ");
        int patternSize = scanner.nextInt();
        printReverseAlphabetPyramidPattern(patternSize);

        // Closing the scanner
        scanner.close();
    }
}
