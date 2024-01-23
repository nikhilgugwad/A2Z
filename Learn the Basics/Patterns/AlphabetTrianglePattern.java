package Patterns;

import java.util.Scanner;

public class AlphabetTrianglePattern {

    // Function to print an alphabet triangle pattern
    static void printAlphabetTrianglePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int ch = 'A'; ch <= 'A' + i; ch++) {
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
        printAlphabetTrianglePattern(patternSize);

        scanner.close();
    }
}
