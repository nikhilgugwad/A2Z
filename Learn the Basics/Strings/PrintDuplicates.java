package Strings;

import java.util.Scanner;

public class PrintDuplicates {

    // Function to print duplicates and their counts in a string
    static void printDuplicates(String inputStr) {
        System.out.println("The input string: " + inputStr);

        int[] counts = new int[26];

        for (char aChar : inputStr.toCharArray()) {
            counts[aChar - 'a'] += 1;
        }

        System.out.println("Duplicates and their counts:");
        for (int i = 0; i < 26; i++) {
            if (counts[i] > 1) {
                System.out.println((char) (i + 'a') + " - " + counts[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        printDuplicates(inputString);

        // Closing the scanner
        scanner.close();
    }
}
