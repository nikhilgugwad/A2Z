package Numbers;

import java.util.Scanner;

public class PalindromeCheck {

    // Function to check if a number is a palindrome
    static void checkPalindrome(int n) {
        int num = 0;
        int temp = n;

        while (n > 0) {
            int lastDigit = n % 10; // Extracting the last digit
            num = num * 10 + lastDigit; // Appending the last digit to num
            n = n / 10; // Shrinking the value of n by 1 digit at a time
        }

        if (temp == num) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        checkPalindrome(number);
    }
}

/*
 * Note:
 * - If the given number is the same when read backward, it's a palindrome.
 * - Otherwise, it's not a palindrome.
 */
