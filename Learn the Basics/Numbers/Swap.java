package Numbers;

import java.util.Scanner;

public class Swap {

    // Function to swap the values of two variables without using a temporary
    // variable
    static void swapNumbers(int x, int y) {
        System.out.println("Before swapping: " + x + " " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping: " + x + " " + y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter the value for x: ");
        int valueX = scanner.nextInt();
        System.out.print("Enter the value for y: ");
        int valueY = scanner.nextInt();
        swapNumbers(valueX, valueY);

        scanner.close();
    }
}
