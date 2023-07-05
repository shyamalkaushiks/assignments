import java.util.ArrayList;
import java.util.List;

public class Q6_FindDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            int index = Math.abs(num);
            if (nums[index - 1] < 0) {
                result.add(index);
            } else {
                nums[index - 1] = -nums[index - 1];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println("Integers that appear twice: " + duplicates);
    }
}
