package Numbers;

import java.util.Scanner;

public class PerfectNumberCheck {

    // Function to check if a number is a perfect number
    static void checkPerfect(int n) {
        int sumOfDivisors = 0;

        // Loop to find all proper divisors (excluding the number itself)
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumOfDivisors += i;
            }
        }

        if (sumOfDivisors == n) {
            System.out.println("It is a perfect number");
        } else {
            System.out.println("Not a perfect number");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        checkPerfect(number);
    }
}

/*
 * Note:
 * - If the sum of proper divisors (excluding the number itself) is equal to the
 * given number, then it's a perfect number.
 * - Otherwise, it's not a perfect number.
 * - Proper divisors refer to all the positive divisors excluding the number
 * itself.
 */
