import java.util.Arrays;

public class Q1_ThreeNumSum {
    public static int threeNumSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }
                
                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return sum;
                }
            }
        }
        
        return closestSum;
    }
    
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int result = threeNumSumClosest(nums, target);
        System.out.println("Result: " + result);
    }
}
