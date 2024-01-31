package Arrays.Medium.SetMatrixZero;

import java.util.ArrayList;
import java.util.Arrays;

public class BruteForce {
    // Method to mark a column with -1
    static void mark_col(ArrayList<ArrayList<Integer>> matrix, int n, int m, int j) {
        for (int i = 0; i < n; i++) {
            if (matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1); // Marking the column with -1
            }
        }
    }

    // Method to mark a row with -1
    static void mark_row(ArrayList<ArrayList<Integer>> matrix, int n, int m, int i) {
        for (int j = 0; j < m; j++) {
            if (matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1); // Marking the row with -1
            }
        }
    }

    // Method to set zeros in the matrix
    static ArrayList<ArrayList<Integer>> set_matrix_zero(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        // Mark rows and columns containing zeros
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    mark_row(matrix, n, m, i); // Mark the row
                    mark_col(matrix, n, m, j); // Mark the column
                }
            }
        }

        // Replace marked elements with zeros
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == -1) {
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
