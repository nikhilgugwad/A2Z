package Strings;

import java.util.Scanner;

public class RemoveVowels {

    // Function to remove vowels from the input string
    static void removeVowels(String inputStr) {
        System.out.println("The input string: " + inputStr);

        // Use regular expression to remove vowels
        String resultStr = inputStr.replaceAll("[aeiouAEIOU]", "");
        System.out.println(resultStr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();

        removeVowels(inputStr);

        // Closing the scanner
        scanner.close();
    }
}
