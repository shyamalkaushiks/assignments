public class Q5_CountContiguousSubstring {
    public static int countSubstrings(String s) {
        int count = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            count++;
            int j = i - 1;
            int k = i + 1;

            while (j >= 0 && k < n && s.charAt(j) == s.charAt(k)) {
                count++;
                j--;
                k++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        int count1 = countSubstrings(s1);
        System.out.println("Count of contiguous substrings in " + s1 + ": " + count1);

        String s2 = "aabaa";
        int count2 = countSubstrings(s2);
        System.out.println("Count of contiguous substrings in " + s2 + ": " + count2);
    }
}
