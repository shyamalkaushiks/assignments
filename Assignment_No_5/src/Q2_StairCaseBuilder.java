public class Q2_StairCaseBuilder {
    public static int countCompleteRows(int n) {
        int row = 0;

        while (n >= row + 1) {
            n -= row + 1;
            row++;
        }

        return row;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = countCompleteRows(n);
        System.out.println("Number of complete rows: " + result);
    }
}
