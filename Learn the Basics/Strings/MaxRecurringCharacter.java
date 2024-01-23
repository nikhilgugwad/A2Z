package Strings;

import java.util.Scanner;

public class MaxRecurringCharacter {

    // Function to find the maximum occurring character(s) in a string
    static void findMaxRecurringChar(String inputStr) {
        int[] charCount = new int[128];
        int maxFrequency = 0;

        // Count character frequencies
        for (char c : inputStr.toCharArray()) {
            charCount[c]++;
            maxFrequency = Math.max(maxFrequency, charCount[c]);
        }

        // Find characters with the maximum frequency
        System.out.print("The maximum occurring character(s) is(are):");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] == maxFrequency) {
                System.out.printf(" %c with a frequency of %d", (char) i, maxFrequency);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        findMaxRecurringChar(inputString);

        // Closing the scanner
        scanner.close();
    }
}
