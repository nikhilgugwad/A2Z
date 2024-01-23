package Numbers;

import java.util.Scanner;

public class SumDigits {

    // Function to calculate the sum of digits in a number
    static void calculateSumDigits(int n) {
        int sumResult = 0;

        while (n > 0) {
            int temp = n % 10;
            sumResult += temp;
            n = n / 10;
        }

        System.out.println(sumResult);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        calculateSumDigits(number);

        scanner.close();
    }
}
