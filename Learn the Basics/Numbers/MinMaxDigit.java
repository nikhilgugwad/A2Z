package Numbers;

import java.util.Scanner;

public class MinMaxDigit {

    // Function to find the minimum and maximum digit in a number
    static void findMinMaxDigit(int n) {
        int minNum = Integer.MAX_VALUE; // sets max value for an integer
        int maxNum = Integer.MIN_VALUE; // sets min value for an integer
        int temp;

        while (n > 0) {
            temp = n % 10; // Extracts the last digit from the given number
            minNum = Math.min(minNum, temp); // Ensures that minNum contains the minimum extracted digit
            maxNum = Math.max(maxNum, temp); // Ensures that maxNum contains the maximum extracted digit
            n = n / 10;
        }

        System.out.println("Maximum digit in the number is: " + maxNum);
        System.out.println("Minimum digit in the number is: " + minNum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        findMinMaxDigit(number);
    }
}
