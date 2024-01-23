package Numbers;

import java.util.Scanner;

public class Factorial {

    // Function to calculate the factorial of a number
    static void calculateFactorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println(fact);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        calculateFactorial(number);
    }
}
