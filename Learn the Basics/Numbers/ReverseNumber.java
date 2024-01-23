package Numbers;

import java.util.Scanner;

public class ReverseNumber {

    // Function to reverse a number
    static void reverseNumber(int n) {
        System.out.println("Original number: " + n);
        int temp, rev = 0;

        while (n > 0) {
            temp = n % 10; // Extracting the last digit
            rev = rev * 10 + temp; // Appending the extracted digit to the rev variable
            n = n / 10; // Shrinking the number (deleting the last digit)
        }

        System.out.println("Reversed number: " + rev);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        reverseNumber(number);

        scanner.close();
    }
}
