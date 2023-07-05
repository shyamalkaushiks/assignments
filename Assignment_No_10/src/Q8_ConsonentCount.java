public class Q8_ConsonentCount {
    public static int countConsonants(String str) {
        int count = 0;
        str = str.toLowerCase(); 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isConsonant(ch)) {
                count++;
            }
        }

        return count;
    }

    public static boolean isConsonant(char ch) {
        ch = Character.toLowerCase(ch); 
        return !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') && Character.isLetter(ch);
    }

    public static void main(String[] args) {
        String str = "abc de";
        int consonantCount = countConsonants(str);
        System.out.println("Total number of consonants: " + consonantCount);
    }
}
