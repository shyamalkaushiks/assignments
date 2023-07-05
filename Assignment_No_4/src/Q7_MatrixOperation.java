public class Q7_MatrixOperation {
    public int maxCount(int m, int n, int[][] ops) {
        if (ops == null || ops.length == 0) {
            return m * n;
        }
        
        int minX = m;
        int minY = n;
        
        for (int[] op : ops) {
            minX = Math.min(minX, op[0]);
            minY = Math.min(minY, op[1]);
        }
        
        return minX * minY;
    }
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] ops = {{2, 2}, {3, 3}};
        
        Q7_MatrixOperation matrixOps = new Q7_MatrixOperation();
        int maxIntegers = matrixOps.maxCount(m, n, ops);
        
        System.out.println("Number of maximum integers: " + maxIntegers);
    }
}

    

