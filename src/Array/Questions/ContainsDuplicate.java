package Array.Questions;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5};
        System.out.println( duplicate(nums));
    }
    public static boolean duplicate(int[] nums){
        int n = nums.length;
        int count = 1;
        for (int i = 0; i < n-1; i++) {
                if (nums[i] == nums[i+1]) {
                    count++;
                    if (count > 2)
                    return true;
                }
        }
        return false;
    }
}
