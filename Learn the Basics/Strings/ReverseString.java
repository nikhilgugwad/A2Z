package Strings;

import java.util.Scanner;

public class ReverseString {

    // Function to reverse a string
    static void reverseString(String inputStr) {
        System.out.println("Original String: " + inputStr);
        char[] characters = inputStr.toCharArray(); // Converting string to an array of characters

        for (int i = 0; i < inputStr.length() / 2; i++) {
            char temp = characters[i];
            characters[i] = characters[inputStr.length() - 1 - i];
            characters[inputStr.length() - 1 - i] = temp;
        }

        // Joining the array of characters to create a string
        String reversedStr = new String(characters);
        System.out.println("Reversed String: " + reversedStr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();

        reverseString(inputStr);

        // Closing the scanner
        scanner.close();
    }
}
