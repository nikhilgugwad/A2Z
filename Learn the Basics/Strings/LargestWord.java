package Strings;

import java.util.Scanner;

public class LargestWord {

    // Function to find the largest word in a string
    static void findLargestWord(String inputStr) {
        // Split the input string into words using whitespace as the delimiter
        String[] words = inputStr.split("\\s+");
        
        String result = "";
        for (String word : words) {
            if (word.length() > result.length()) {
                result = word;
            }
        }

        System.out.println("The largest word is: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        findLargestWord(inputString);

        // Closing the scanner
        scanner.close();
    }
}
