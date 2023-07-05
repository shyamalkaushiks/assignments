public class Q7_Permutaion {
    public static void printPermutations(String str) {
        int n = str.length();
        char[] arr = str.toCharArray();
        printPermutationsUtil(arr, 0, n - 1);
    }

    public static void printPermutationsUtil(char[] arr, int left, int right) {
        if (left == right) {
            System.out.println(new String(arr));
        } else {
            for (int i = left; i <= right; i++) {
                swap(arr, left, i);
                printPermutationsUtil(arr, left + 1, right);
                swap(arr, left, i); // Backtrack
            }
        }
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String str = "cd";
        printPermutations(str);
    }
}
