package Numbers;

import java.util.Scanner;

public class FibonacciSeries {

    // Function to print the Fibonacci series up to a given number
    static void printFibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.print("The Fibonacci series up to " + n + " is: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        printFibonacciSeries(number);
    }
}
