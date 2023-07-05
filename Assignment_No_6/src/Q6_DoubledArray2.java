import java.util.ArrayList;
import java.util.List;

public class Q6_DoubledArray2 {
    public static int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if (n % 2 != 0) {
            return new int[0]; 
        }

        int[] counts = new int[100001]; 

        for (int num : changed) {
            counts[num]++;
        }

        List<Integer> originalList = new ArrayList<>();

        for (int num : changed) {
            if (counts[num] == 0) {
                continue; 
            }

            if (counts[2 * num] == 0) {
                return new int[0]; 
            }

            originalList.add(num);
            counts[num]--;
            counts[2 * num]--;
        }

        int[] original = new int[originalList.size()];
        for (int i = 0; i < originalList.size(); i++) {
            original[i] = originalList.get(i);
        }

        return original;
    }

    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = findOriginalArray(changed);

        if (original.length == 0) {
            System.out.println("Empty array");
        } else {
            for (int num : original) {
                System.out.print(num + " ");
            }
        }
    }
}
