package Arrays.Medium.RotateMatrixBy90Degrees;

public class BruteForce {
    // Method to rotate a square matrix by 90 degrees
    static int[][] rotate_matrix(int[][] matrix, int n) {
        // Create a new matrix to store the rotated values
        int[][] rotated = new int[n][n];
        // Traverse through each element of the original matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Place the element from original matrix into rotated matrix
                // Rotate the indices: (i,j) -> (j, n - i - 1)
                // This formula rotates the matrix by 90 degrees clockwise
                rotated[j][n - i - 1] = matrix[i][j];
            }
        }

        // Return the rotated matrix
        return rotated;
    }

    public static void main(String[] args) {
        // Input matrix
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = matrix.length; // Size of the matrix
        // Rotate the matrix
        int[][] rotated = rotate_matrix(matrix, n);
        System.out.println("The rotated matrix by 90 degrees : ");
        // Print the rotated matrix
        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated.length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
