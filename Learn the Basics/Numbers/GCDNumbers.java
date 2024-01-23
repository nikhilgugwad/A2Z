package Numbers;

import java.util.Scanner;

public class GCDNumbers {

    // Function to calculate the Greatest Common Divisor (GCD) of two numbers
    static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        return calculateGCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        scanner.close();
        int result = calculateGCD(number1, number2);
        System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + result);
    }
}
