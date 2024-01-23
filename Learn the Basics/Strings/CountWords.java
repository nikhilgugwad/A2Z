package Strings;

import java.util.Scanner;

public class CountWords {

    // Function to count the number of words in a given string
    static void countWords(String inputStr) {
        // Split the input string into words using whitespace as the delimiter
        String[] words = inputStr.split("\\s+");
        System.out.println("The number of words in the given string: " + words.length);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        countWords(inputString);

        // Closing the scanner
        scanner.close();
    }
}
