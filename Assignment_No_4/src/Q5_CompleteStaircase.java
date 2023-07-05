public class Q5_CompleteStaircase {
    public static int arrangeCoins(int n) {
        int rows = 0;
        int coins = n;
        int currentRow = 1;

        while (coins >= currentRow) {
            coins -= currentRow;
            rows++;
            currentRow++;
        }

        return rows;
    }

    public static void main(String[] args) {
        int n = 5;
        int completeRows = arrangeCoins(n);
        System.out.println(completeRows);
    }
}
