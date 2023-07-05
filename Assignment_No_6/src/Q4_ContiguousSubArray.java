public class Q4_ContiguousSubArray {
    public static int findMaxLength(int[] nums) {
        int n = nums.length;
        int maxLength = 0;
        int count = 0;
        
        int[][] countArray = new int[2 * n + 1][2];
        
        for (int i = 0; i < countArray.length; i++) {
            countArray[i][0] = -1;
        }
        
        countArray[n][0] = 0;
        
        for (int i = 0; i < n; i++) {
            count += (nums[i] == 0 ? -1 : 1);
            
            int index = count + n;
            
            if (countArray[index][0] == -1) {
                countArray[index][0] = i + 1;
            } else {
                int length = i + 1 - countArray[index][0];
                
                maxLength = Math.max(maxLength, length);
            }
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1};
        int maxLength = findMaxLength(nums);
        System.out.println(maxLength);
    }
}
