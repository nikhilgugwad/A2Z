package Numbers;

import java.util.Scanner;

public class SumNaturalNumbers {

    // Function to calculate the sum of natural numbers up to a given number
    static void calculateSumNaturalNumbers(int n) {
        int sumResult = 0;

        for (int i = 1; i <= n; i++) {
            sumResult += i;
        }

        System.out.println(sumResult);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        calculateSumNaturalNumbers(number);

        scanner.close();
    }
}
