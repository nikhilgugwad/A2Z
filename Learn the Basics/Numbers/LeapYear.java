package Numbers;

import java.util.Scanner;

public class LeapYear {

    // Function to check if a year is a leap year
    static void checkLeapYear(int year) {
        // A year is a leap year only if it satisfies the following conditions:
        // 1. The year is divisible by 400; if this doesn't satisfy, then the next
        // condition should be met.
        // 2. The year is divisible by 4 but not by 100.
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Specified year is a leap year");
        } else {
            System.out.println("Specified year is not a leap year");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter a year: ");
        int inputYear = scanner.nextInt();
        scanner.close();
        checkLeapYear(inputYear);
    }
}
