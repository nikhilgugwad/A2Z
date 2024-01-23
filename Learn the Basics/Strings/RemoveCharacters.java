package Strings;

import java.util.Scanner;

public class RemoveCharacters {

    // Function to remove characters from the first string present in the second string
    static void removeCharacters(String str1, String str2) {
        StringBuilder result = new StringBuilder();

        for (char char1 : str1.toCharArray()) {
            boolean flag = false;  // Flag is set to false initially
            for (char char2 : str2.toCharArray()) {
                if (char1 == char2) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                result.append(char1);  // Append the character from str1 not present in str2
            }
        }

        System.out.println("Resultant string: " + result.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        removeCharacters(string1, string2);

        // Closing the scanner
        scanner.close();
    }
}
