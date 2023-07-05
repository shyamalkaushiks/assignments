public class Q1_PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        int n1 = 27;
        boolean result1 = isPowerOfThree(n1);
        System.out.println(n1 + " is a power of three: " + result1);

        int n2 = 0;
        boolean result2 = isPowerOfThree(n2);
        System.out.println(n2 + " is a power of three: " + result2);
    }
}
