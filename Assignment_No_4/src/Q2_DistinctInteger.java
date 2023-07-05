import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2_DistinctInteger {
    public static List<Integer>[] findDistinctIntegers(int[] nums1, int[] nums2) {
        List<Integer>[] answer = new List[2];
        answer[0] = new ArrayList<>();
        answer[1] = new ArrayList<>();

        Arrays.sort(nums1); 
        Arrays.sort(nums2); 

        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                answer[0].add(nums1[i]);
                i++;
            } else if (nums1[i] > nums2[j]) {
                answer[1].add(nums2[j]);
                j++;
            } else { 
                i++;
                j++;
            }
        }

        while (i < nums1.length) {
            answer[0].add(nums1[i]);
            i++;
        }

        while (j < nums2.length) {
            answer[1].add(nums2[j]);
            j++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        List<Integer>[] distinctIntegers = findDistinctIntegers(nums1, nums2);

        System.out.println("Distinct integers in nums1: " + distinctIntegers[0]);

        System.out.println("Distinct integers in nums2: " + distinctIntegers[1]);
    }
}
