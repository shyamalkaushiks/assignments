import java.util.Arrays;

public class Q4_Partition {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums); 
        int n = nums.length / 2;
        int[][] pairs = new int[n][2];
        int maxSum = 0;

        for (int i = 0, j = 0; i < nums.length; i += 2, j++) {
            pairs[j][0] = nums[i];
            pairs[j][1] = nums[i + 1];
            maxSum += pairs[j][0];
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        int maxSum = arrayPairSum(nums);
        System.out.println(maxSum);
    }
}
