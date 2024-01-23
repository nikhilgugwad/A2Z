package Strings;

import java.util.Scanner;

public class CharacterFrequency {

    // Function to calculate and print character frequencies
    static void calculateCharFrequency(String inputStr) {
        inputStr = inputStr.toLowerCase();  // Convert to lower case
        for (char ch = 'a'; ch <= 'z'; ch++) {  // Iterate through all alphabets
            int count = 0;
            for (int i = 0; i < inputStr.length(); i++) {
                if (ch == inputStr.charAt(i)) {
                    count++;  // If ch (e.g., 'a') == inputStr.charAt(i)
                }
            }
            System.out.println(ch + " " + count);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();
        calculateCharFrequency(inputStr);

        // Closing the scanner
        scanner.close();
    }
}
