public class Q1_Isomorphic_Sttring {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] sPattern = new int[128];
        int[] tPattern = new int[128];

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sPattern[sChar] != tPattern[tChar]) {
                return false;
            }

            sPattern[sChar] = i + 1;
            tPattern[tChar] = i + 1;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        boolean isIsomorphic = isIsomorphic(s, t);
        System.out.println(isIsomorphic);
    }
}
