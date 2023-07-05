import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q7_MissingRange {
    public static int[][] findMissingRanges(int[] nums, int lower, int upper) {
        if (nums.length == 0) {
            return new int[][]{{lower, upper}};
        }
        
        List<int[]> missingRanges = new ArrayList<>();
        
        if (nums[0] > lower) {
            missingRanges.add(new int[]{lower, nums[0] - 1});
        }
        
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i] + 1) {
                missingRanges.add(new int[]{nums[i] + 1, nums[i + 1] - 1});
            }
        }
        
        if (nums[nums.length - 1] < upper) {
            missingRanges.add(new int[]{nums[nums.length - 1] + 1, upper});
        }
        
        return missingRanges.toArray(new int[0][]);
    }
    
    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;
        int[][] missingRanges = findMissingRanges(nums, lower, upper);
        
        for (int[] range : missingRanges) {
            System.out.println(Arrays.toString(range));
        }
    }
}
