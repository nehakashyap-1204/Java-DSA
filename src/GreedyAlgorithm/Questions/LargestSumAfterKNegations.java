package GreedyAlgorithm.Questions;

import java.util.Arrays;

public class LargestSumAfterKNegations {
    public static void main(String[] args) {
        int[] nums = {2, -3, -1, 5, -4};
        int k = 2;
        System.out.println(largestSumAfterKNegations(nums, k));
    }
    public static int largestSumAfterKNegations(int[] nums, int k) {
        int sum = 0;
        while (k > 0) {
            Arrays.sort(nums);
            nums[0] = -nums[0];
            k--;
        }
        for(int j = 0; j < nums.length; j++) {
            sum += nums[j];
        }
        return sum;
    }
}
