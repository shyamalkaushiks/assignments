public class Q1_ReconstructPermutation {
    public static int[] findPermutation(String s) {
        int n = s.length();
        int[] perm = new int[n + 1];
        int low = 0;
        int high = n;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                perm[i] = high;
                high--;
            } else if (s.charAt(i) == 'D') {
                perm[i] = low;
                low++;
            }
        }

        perm[n] = low;

        return perm;
    }

    public static void main(String[] args) {
        String s = "IDID";
        int[] perm = findPermutation(s);

        System.out.print("Permutation: ");
        for (int num : perm) {
            System.out.print(num + " ");
        }
    }
}

