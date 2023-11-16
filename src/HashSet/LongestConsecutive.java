package HashSet;

import java.util.HashSet;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums = {99,1,100,4,200,1,2,2,3};
        System.out.println( longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> st = new HashSet<Integer>();
        for(int num : nums) {
            st.add(num);
        }
        int maxStreak = 0;
        for(int num : st) {
            if (!st.contains(num -1)) { // num is starting point of a sequence
                int currNum = num; // 1
                int currStreak = 1;
                while (st.contains(currNum+1)) {
                    currStreak++;
                    currNum++;
                }
                maxStreak = Math.max(maxStreak, currStreak);
            }
        }
        return maxStreak;
    }
}
