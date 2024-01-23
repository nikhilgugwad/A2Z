package Numbers;

import java.util.Scanner;

public class FactorsOfANumber {

    // Function to print the factors of a number
    static void printFactors(int n) {
        System.out.print("The factors of number " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        printFactors(number);
    }
}
