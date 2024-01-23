package Strings;

import java.util.Scanner;

public class RemoveDuplicates {

    // Function to remove duplicates from the input string
    static void removeDuplicates(String inputStr) {
        System.out.println("The input string: " + inputStr);
        boolean[] boolList = new boolean[26];  // Create an empty boolean list where all boolean values are false initially
        StringBuilder modifiedStr = new StringBuilder();  // Create a new StringBuilder to receive the modified string with no duplicates

        for (char ch : inputStr.toCharArray()) {
            if (!boolList[ch - 'a']) {  // When a boolean index position is false
                // 1) Add the character to 'modifiedStr'
                // 2) Make that position true to ensure that no repeated character is added to 'modifiedStr' again
                modifiedStr.append(ch);
                boolList[ch - 'a'] = true;
            }
        }

        System.out.println("After removing duplicates: " + modifiedStr.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();

        removeDuplicates(inputStr);

        // Closing the scanner
        scanner.close();
    }
}
