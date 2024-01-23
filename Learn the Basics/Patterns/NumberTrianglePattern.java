package Patterns;

import java.util.Scanner;

public class NumberTrianglePattern {

    // Function to print a number triangle pattern
    static void printNumberTrianglePattern(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter the size of the pattern: ");
        int patternSize = scanner.nextInt();
        printNumberTrianglePattern(patternSize);

        // Closing the scanner
        scanner.close();
    }
}
