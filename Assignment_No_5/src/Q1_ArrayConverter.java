public class Q1_ArrayConverter {
    public static int[][] convertTo2DArray(int[] original, int m, int n) {
        int[][] result = new int[m][n];
        if (original.length != m * n) {
            return new int[0][0]; 
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[i * n + j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int m = 2;
        int n = 2;

        int[][] result = convertTo2DArray(original, m, n);

       
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
