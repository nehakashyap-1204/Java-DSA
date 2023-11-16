package HashMap.Questions;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {7, 4, 14, 25, 5};
        int target = 12;
//        System.out.println(Arrays.toString(twoSum(arr, target)));
        System.out.println(Arrays.toString(usingHashMap(arr, target)));
    }
    public static int[] twoSum(int[] nums, int target) {  // TC : O(N^2)
        int n = nums.length;
        int[] ans = {-1};
        for (int i = 0; i < n; i++) {
            for (int j = i +1; j < n; j++) {
                if (nums[j] == target - nums[i]) {
                    ans = new int[]{i ,j};
                }
            }
        }
        return ans;
    }
    public static int[] usingHashMap(int[] nums, int target) { // TC : O(N)
        int n = nums.length;
        int[] ans = {-1};
        // value index
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(0);
        for (int i = 0; i < n; i++) {
            int partner = target - nums[i];
            if (map.containsKey(partner)) {
                ans = new int[]{i, map.get(partner)};
                return ans;
            } else {
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}
