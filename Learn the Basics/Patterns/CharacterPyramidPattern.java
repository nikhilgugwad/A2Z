package Patterns;

import java.util.Scanner;

public class CharacterPyramidPattern {

    // Function to print a character pyramid pattern
    static void printCharacterPyramidPattern(int n) {
        for (int i = 0; i < n; i++) {
            // To print spaces, the formula is n-i-1
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // To print characters, the formula is 2*i+1
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakpoint) {
                    ch = (char) (ch + 1);
                } else {
                    ch = (char) (ch - 1);
                }
            }

            // To print spaces, the formula is n-i-1
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter the size of the pattern: ");
        int patternSize = scanner.nextInt();
        printCharacterPyramidPattern(patternSize);

        // Closing the scanner
        scanner.close();
    }
}
