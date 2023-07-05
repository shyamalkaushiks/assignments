public class Q2_LastRemainingNumber {
    public static int lastRemaining(int n) {
        boolean leftToRight = true;
        int remaining = n;
        int step = 1;
        int head = 1;

        while (remaining > 1) {
            if (leftToRight || remaining % 2 == 1) {
                head += step;
            }
            remaining /= 2;
            step *= 2;
            leftToRight = !leftToRight;
        }

        return head;
    }

    public static void main(String[] args) {
        int n1 = 9;
        int lastNum1 = lastRemaining(n1);
        System.out.println("Last number remaining in arr: " + lastNum1);

        int n2 = 1;
        int lastNum2 = lastRemaining(n2);
        System.out.println("Last number remaining in arr: " + lastNum2);
    }
}
