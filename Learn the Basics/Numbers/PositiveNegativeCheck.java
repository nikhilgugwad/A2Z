package Numbers;

import java.util.Scanner;

public class PositiveNegativeCheck {

    // Function to check if a number is positive or negative
    static void checkPositiveNegative(int n) {
        if (n >= 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        checkPositiveNegative(number);
    }
}
