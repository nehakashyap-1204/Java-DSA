package Array.Questions;

public class EvenOddSubarray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        System.out.println(longestAlternatingSubarray(arr, 4));
    }
    public static int longestAlternatingSubarray(int[] nums, int threshold) {
        int n = nums.length;
        int ans = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if ((nums[i] % 2 == 0) && nums[i] <= threshold) {
                count++;
                while (i+1 < n) {
                    if ((nums[i] % 2 != nums[i+1] % 2) && nums[i+1] <= threshold) {
                        count++;
                    } else {
                        break;
                    }
                    i++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}
