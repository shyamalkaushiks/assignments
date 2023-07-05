import java.util.Arrays;

public class Q2_FourSumArray {
    public static int[][] fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int[][] result = new int[n * (n - 1) * (n - 2) * (n - 3) / 24][4];
        int count = 0;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; 
            }

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue; 
                }

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        result[count][0] = nums[i];
                        result[count][1] = nums[j];
                        result[count][2] = nums[left];
                        result[count][3] = nums[right];
                        count++;

                        while (left < right && nums[left] == nums[left + 1]) {
                            left++; // Skip duplicate elements
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--; // Skip duplicate elements
                        }
                        left++;
                        right--;
                    }
                }
            }
        }

        return Arrays.copyOf(result, count);
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        int[][] result = fourSum(nums, target);

        System.out.println("Result:");
        for (int[] quadruplet : result) {
            System.out.println(Arrays.toString(quadruplet));
        }
    }
}
