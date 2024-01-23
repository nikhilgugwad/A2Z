package Strings;

import java.util.Scanner;

public class CheckPalindrome {

    // Function to check if a string is a palindrome using the two pointers approach
    static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;  // The left pointer will traverse the string from the left end
        int right = s.length() - 1;  // The right pointer will traverse from the extreme right end
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();
        boolean result = isPalindrome(inputStr);
        System.out.println("The string is a palindrome: " + result);

        // Closing the scanner
        scanner.close();
    }
}
