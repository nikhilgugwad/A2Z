package Numbers;

import java.util.Scanner;

public class SumGPSeries {

    // Function to calculate the sum of a Geometric Progression (GP) series
    static void calculateSumGPSeries(int n, double a, double r) {
        double sumResult = 0.0;

        for (int i = 1; i <= n; i++) {
            sumResult += a;
            a *= r;
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
        System.out.print("Enter the common ratio (r): ");
        double commonRatio = scanner.nextDouble();

        calculateSumGPSeries(nValue, firstTerm, commonRatio);

        scanner.close();
    }
}
