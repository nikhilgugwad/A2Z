package Arrays.Medium.SetMatrixZero;

public class Optimal {
    // Method to set zeros in the matrix
    static void set_matrix_zero(int[][] matrix) {
        // Flags to track if the first row or first column contains zeros
        boolean firstRow = false;
        boolean firstCol = false;

        // Set markers (meaning to replace the existing value with zero) in first row
        // and first column wherever zeros are found in the entire matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0)
                        firstRow = true;
                    if (j == 0)
                        firstCol = true;
                    matrix[0][j] = 0; // Mark the column
                    matrix[i][0] = 0; // Mark the row
                }
            }
        }

        // Replace inner matrix elements with zeros based on the markers in the first
        // row and first column
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0; // Set the element to zero
                }
            }
        }

        // Check if first row or first column needs to be set entirely to zero
        if (firstRow) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0; // Set entire first row to zero
            }
        }

        if (firstCol) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0; // Set entire first column to zero
            }
        }
    }

    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 0, 2 }, { 1, 3, 1, 5 } };
        // Call method to set zeros
        set_matrix_zero(matrix);
        // Print the modified matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
