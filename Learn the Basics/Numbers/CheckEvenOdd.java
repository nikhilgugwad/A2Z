package Numbers;

import java.util.Scanner;

public class CheckEvenOdd {

    // Function to check if a number is even or odd
    static void checkEvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("This is an even number");
        } else {
            System.out.println("This is an odd number");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        checkEvenOdd(number);
    }
}

/*
 * Note:
 * - If the given number is divisible by 2 without any remainder, then it's an
 * even number.
 * - Otherwise, it's an odd number.
 */
