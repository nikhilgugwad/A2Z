package Arrays.Medium.SetMatrixZero;

import java.util.ArrayList;
import java.util.Arrays;

public class Better {
    // Method to set zeros in the matrix
    static ArrayList<ArrayList<Integer>> set_matrix_zero(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        // Arrays to track which rows and columns contain zeros
        int[] row = new int[n];
        int[] col = new int[m];

        // Mark rows and columns containing zeros
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    row[i] = 1; // Mark the row
                    col[j] = 1; // Mark the column
                }
            }
        }

        // Replace elements with zeros based on the marked rows and columns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix.get(i).set(j, 0); // Set the element to zero
                }
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        // Example matrix as ArrayList of ArrayLists
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = matrix.size(); // Number of rows
        int m = matrix.get(0).size(); // Number of columns

        // Call method to set zeros
        ArrayList<ArrayList<Integer>> ans = set_matrix_zero(matrix, n, m);

        // Print the modified matrix
        System.out.println("The final matrix is : ");
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
