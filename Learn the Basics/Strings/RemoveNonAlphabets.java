package Strings;

import java.util.Scanner;

public class RemoveNonAlphabets {

    // Function to remove non-alphabetic characters from the input string
    static void removeNonAlphabets(String inputStr) {
        System.out.println("The input string: " + inputStr);

        // Use regular expression to remove non-alphabetic characters
        String resultStr = inputStr.replaceAll("[^a-zA-Z]", "");
        System.out.println(resultStr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();

        removeNonAlphabets(inputStr);

        // Closing the scanner
        scanner.close();
    }
}
