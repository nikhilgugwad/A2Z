package Strings;

import java.util.Scanner;

public class NonRecurringCharacters {

    // Function to find non-recurring characters in a string
    static void findNonRecurringChar(String inputStr) {
        int[] freq = new int[200];
        char[] s = inputStr.toCharArray();

        // Incrementing the index of freq[] for the characters of the string
        for (int i = 0; i < inputStr.length(); i++) {
            if (inputStr.charAt(i) != ' ') {
                freq[inputStr.charAt(i)]++;
            }
        }

        System.out.print("Non-Recurring Characters:");
        for (int i = 0; i < inputStr.length(); i++) {
            if (freq[inputStr.charAt(i)] == 1 && s[i] != ' ') {
                System.out.print(" " + s[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        findNonRecurringChar(inputString);

        // Closing the scanner
        scanner.close();
    }
}
