package Numbers;

import java.util.Scanner;

public class CheckArmstrongNumber {

    // Function to check if a number is an Armstrong number
    static void checkArmstrong(int n) {
        int original = n;
        int sum = 0;
        int numberLength = 0;
        int temp = n;

        // Calculate the length of the given number and store it in numberLength
        while (temp != 0) {
            numberLength++;
            temp = temp / 10;
        }

        n = original; // Reset n to the original value

        // Calculate the sum of digits raised to the power of the number length
        while (n != 0) {
            int lastDigit = n % 10; // Extracting last digit from the given number
            sum += Math.pow(lastDigit, numberLength); // Raising the power (equal to the length of a number) to the last
                                                      // digit
            n /= 10; // Shrinking the given number, till it reaches 0 to end the loop
        }

        if (original == sum) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        checkArmstrong(number);
    }
}

/*
 * Note:
 * - n=153->length=3->1^3+5^3+3^3=153->then it's an Armstrong number.
 */
