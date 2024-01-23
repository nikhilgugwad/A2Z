package Strings;

import java.util.Scanner;

public class FindASCII {

    // Function to find the ASCII value of a character
    static void findASCII(char inputChar) {
        int asciiValue = (int) inputChar;
        System.out.println(asciiValue);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);  // Take the first character if more than one are entered
        findASCII(inputChar);

        // Closing the scanner
        scanner.close();
    }
}
