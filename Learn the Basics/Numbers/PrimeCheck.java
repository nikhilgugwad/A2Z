package Numbers;

import java.util.Scanner;

public class PrimeCheck {

    // Function to check if a number is prime
    static void checkPrime(int n) {
        int count = 0; // count can have 2 as the max value because if a number is prime, its factors
                       // will be the number itself and 1

        for (int i = 1; i <= n; i++) { // looping from 1 to n to check all possible factors; if n is prime, there will
                                       // be only 2 factors (n and 1)
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        checkPrime(number);
    }
}

/*
 * Note:
 * - A prime number only has 2 factors; a factor is a number upon dividing the
 * remainder will be 0.
 */
