import java.util.ArrayList;
import java.util.List;

public class Q4_DistinctInteger {
    public static int[][] findDistinctIntegers(int[] nums1, int[] nums2) {
        List<Integer> notInNums2 = new ArrayList<>();
        List<Integer> notInNums1 = new ArrayList<>();

        for (int num : nums1) {
            boolean found = false;
            for (int other : nums2) {
                if (num == other) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                notInNums2.add(num);
            }
        }

        for (int num : nums2) {
            boolean found = false;
            for (int other : nums1) {
                if (num == other) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                notInNums1.add(num);
            }
        }

        int[][] result = new int[2][];
        result[0] = listToArray(notInNums1);
        result[1] = listToArray(notInNums2);

        return result;
    }

    private static int[] listToArray(List<Integer> list) {
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};

        int[][] result = findDistinctIntegers(nums1, nums2);

        System.out.println("Distinct integers in nums1 not present in nums2: " + arrayToString(result[0]));
        System.out.println("Distinct integers in nums2 not present in nums1: " + arrayToString(result[1]));
    }

    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
