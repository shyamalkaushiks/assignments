public class Q6_SingleNumber {
    public static int SingleNumber(int[] nums) {
        int result = 0;
        
        for (int num : nums) {
            result ^= num;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        
        int singleNumber = SingleNumber(nums);
        
        System.out.println("Single number: " + singleNumber);
    }
}
