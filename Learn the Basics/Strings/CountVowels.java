package Strings;

import java.util.Scanner;

public class CountVowels {

    // Function to count vowels, consonants, and spaces in a string
    static void countCharacters(String str) {
        str = str.toLowerCase();  // for case sensitivity
        int vowels = 0;
        int consonants = 0;
        int spaces = 0;
        
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch == ' ') {
                spaces++;
            } else {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Spaces: " + spaces);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();
        countCharacters(inputStr);

        // Closing the scanner
        scanner.close();
    }
}
