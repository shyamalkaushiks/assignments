import java.util.ArrayList;
import java.util.List;

public class Q8_Doubled2Array {
    public static int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[0]; // Invalid input, return empty array
        }

        int n = changed.length;
        int[][] freq = new int[n / 2 + 1][2];
        List<Integer> originalList = new ArrayList<>();

        for (int num : changed) {
            if (num % 2 != 0) {
                return new int[0]; // Invalid input, return empty array
            }

            num /= 2;
            if (freq[num][0] < freq[num][1]) {
                originalList.add(num);
                freq[num][0]++;
            } else {
                freq[changed.length / 2][1]++;
            }
        }

        if (originalList.size() != changed.length / 2) {
            return new int[0]; // Invalid input, return empty array
        }

        int[] original = new int[originalList.size()];
        for (int i = 0; i < original.length; i++) {
            original[i] = originalList.get(i);
        }

        return original;
    }

    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = findOriginalArray(changed);

        System.out.print("Original array: ");
        if (original.length == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            for (int i = 0; i < original.length - 1; i++) {
                System.out.print(original[i] + ", ");
            }
            System.out.println(original[original.length - 1] + "]");
        }
    }
}
