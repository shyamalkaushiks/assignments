import java.util.Arrays;

public class Q1_CommonElements {
    public static int[] findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        int[][] arrays = {arr1, arr2, arr3};
        int[] pointers = new int[3]; 
        int[] result = new int[arr1.length]; 
        int resultIndex = 0; 

        while (pointers[0] < arr1.length && pointers[1] < arr2.length && pointers[2] < arr3.length) {
            int minValue = Integer.MAX_VALUE; 

            for (int i = 0; i < 3; i++) {
                minValue = Math.min(minValue, arrays[i][pointers[i]]);
            }

            if (arrays[0][pointers[0]] == minValue && arrays[1][pointers[1]] == minValue && arrays[2][pointers[2]] == minValue) {
                result[resultIndex++] = minValue;
            }

           
            for (int i = 0; i < 3; i++) {
                if (arrays[i][pointers[i]] == minValue) {
                    pointers[i]++;
                }
            }
        }

        return Arrays.copyOf(result, resultIndex);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 5, 7, 9};
        int[] arr3 = {1, 3, 4, 5, 8};
        int[] commonElements = findCommonElements(arr1, arr2, arr3);

        System.out.println(Arrays.toString(commonElements));
    }
}
