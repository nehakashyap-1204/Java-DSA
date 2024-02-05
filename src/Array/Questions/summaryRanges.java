package Array.Questions;

import java.util.ArrayList;
import java.util.List;

public class summaryRanges {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            System.out.println(s.append(String.valueOf(nums[i])));
        }
        // List<String> answer = summaryRange(nums);
//        for (int i = 0; i < answer.size(); i++) {
//            System.out.print(answer.get(i) + " ");
//        }
    }

    public static List<String> summaryRange(int[] nums) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            int prev_diff = 0;
            int next_diff = 0;
            if (sb.length() == 0) {
                sb.append(String.valueOf(nums[i]));
            }
            if (i > 0) {
                prev_diff = nums[i] - nums[i-1];
            }
            if (i < nums.length -1) {
                next_diff = nums[i+1] - nums[i];
            }
            if (prev_diff == 1 && next_diff != 1) {
                sb.append("->" + String.valueOf(nums[i]));
                list.add(sb.toString());
                sb.setLength(0);
            }
            if (prev_diff != 1 && next_diff != 1) {
                list.add(sb.toString());
                sb.setLength(0);
            }
        }
        return list;
    }
}
