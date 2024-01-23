package Patterns;

import java.util.Scanner;

public class AlternatingPattern {

    // Function to print an alternating pattern of 0s and 1s
    static void printAlternatingPattern(int n) {
        for (int i = 0; i < n; i++) {
            int start = (i % 2 == 0) ? 1 : 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter the size of the pattern: ");
        int patternSize = scanner.nextInt();
        printAlternatingPattern(patternSize);

        // Closing the scanner
        scanner.close();
    }
}
