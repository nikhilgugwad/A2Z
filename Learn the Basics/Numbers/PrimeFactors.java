package Numbers;

import java.util.Scanner;

public class PrimeFactors {

    // Function to print the prime factors of a number
    static void printPrimeFactors(int n) {
        System.out.print("Prime Factors: ");

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    System.out.print(i + " ");
                    n = n / i;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        printPrimeFactors(number);
    }
}
