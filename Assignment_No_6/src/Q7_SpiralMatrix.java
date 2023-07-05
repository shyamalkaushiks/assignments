public class Q7_SpiralMatrix {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1; // Start number
        int topRow = 0, bottomRow = n - 1; 
        int leftCol = 0, rightCol = n - 1; 

        while (num <= n * n) {
            for (int col = leftCol; col <= rightCol; col++) {
                matrix[topRow][col] = num++;
            }
            topRow++;

            for (int row = topRow; row <= bottomRow; row++) {
                matrix[row][rightCol] = num++;
            }
            rightCol--;

            for (int col = rightCol; col >= leftCol; col--) {
                matrix[bottomRow][col] = num++;
            }
            bottomRow--;

            for (int row = bottomRow; row >= topRow; row--) {
                matrix[row][leftCol] = num++;
            }
            leftCol++;
        }

        return matrix;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = generateMatrix(n);

        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
