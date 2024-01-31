package Arrays.Medium.SpiralTraversalOfMatrix;

import java.util.ArrayList;

public class SpiralTraversal {
    // Function to perform spiral traversal of a matrix
    static ArrayList<Integer> spiral_traversal(int[][] matrix) {
        // Initialize an ArrayList to store the traversal result
        ArrayList<Integer> ans = new ArrayList<>();
        // Get the number of rows and columns in the matrix
        int n = matrix.length; // Number of rows
        int m = matrix[0].length; // Number of columns

        // Initialize variables for boundaries of the matrix
        int left = 0; // Left boundary
        int top = 0; // Top boundary
        int right = m - 1; // Right boundary
        int bottom = n - 1; // Bottom boundary

        // Traverse the matrix in a spiral manner
        while (left <= right && top <= bottom) {
            // Traverse top row from left to right
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++; // Move to the next row

            // Traverse rightmost column from top to bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--; // Move to the previous column

            // Traverse bottom row from right to left if there's more than one row left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--; // Move to the previous row
            }

            // Traverse leftmost column from bottom to top if there's more than one column
            // left
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++; // Move to the next column
            }
        }

        // Return the spiral traversal result
        return ans;
    }

    // Main method to test the spiral traversal function
    public static void main(String[] args) {
        // Sample input matrix
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        // Perform spiral traversal on the input matrix
        ArrayList<Integer> ans = spiral_traversal(matrix);

        // Print the elements traversed spirally
        System.out.println("All elements that were traversed spirally are");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
