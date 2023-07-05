import java.util.Arrays;

public class Q3_Matrix {
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] Matrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
               Matrix[j][i] = matrix[i][j];
            }
        }

        return Matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] Matrix = transpose(matrix);

        // Print the transpose matrix
        for (int[] row : Matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
