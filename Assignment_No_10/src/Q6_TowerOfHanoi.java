public class Q6_TowerOfHanoi {
    public static void solveTowerOfHanoi(int n, int i, int j, int k) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + i + " to rod " + k);
            return;
        }
        
        solveTowerOfHanoi(n - 1, i, k, j);
        System.out.println("Move disk " + n + " from rod " + i + " to rod " + k);
        solveTowerOfHanoi(n - 1, j, i, k);
    }

    public static int countTowerOfHanoiMoves(int n) {
        return (int) Math.pow(2, n) - 1;
    }

    public static void main(String[] args) {
        int n = 2; 
        
        solveTowerOfHanoi(n, 1, 2, 3);
        
        int totalMoves = countTowerOfHanoiMoves(n);
        System.out.println("Total moves: " + totalMoves);
    }
}
