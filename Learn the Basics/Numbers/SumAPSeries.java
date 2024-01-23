package Numbers;

import java.util.Scanner;

public class SumAPSeries {

    // Function to calculate the sum of an Arithmetic Progression (AP) series
    static void calculateSumAPSeries(int n, double a, double d) {
        double sumResult = 0.0;

        for (int i = 1; i <= n; i++) {
            sumResult += a;
            a += d;
        }

        System.out.println(sumResult);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter the total numbers in the series (n): ");
        int nValue = scanner.nextInt();
        System.out.print("Enter the first term (a): ");
        double firstTerm = scanner.nextDouble();
        System.out.print("Enter the common difference (d): ");
        double commonDifference = scanner.nextDouble();

        calculateSumAPSeries(nValue, firstTerm, commonDifference);

        scanner.close();
    }
}
