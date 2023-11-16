package Array.Questions;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,4,5};
        int[] arr2 = {2,4,6,8};
        int[] ans = merge(arr1, arr2);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] merge(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int[] res = new int[arr1.length + arr2.length];
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                res[k] = arr1[i];
                i++;
                k++;
            } else {
                res[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < arr1.length) {
            res[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            res[k] = arr2[j];
            j++;
            k++;
        }
        return res;
    }
}
