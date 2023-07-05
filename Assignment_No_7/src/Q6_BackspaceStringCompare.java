public class Q6_BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        return processString(s).equals(processString(t));
    }

    private static String processString(String str) {
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                sb.append(ch);
            } else if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        boolean isEqual = backspaceCompare(s, t);
        System.out.println(isEqual);
    }
}
