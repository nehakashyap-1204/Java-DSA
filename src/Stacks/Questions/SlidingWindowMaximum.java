package Stacks.Questions;

import java.util.Arrays;
import java.util.Stack;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int [] res = maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(res));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        int z = 0;
        Stack <Integer> st = new Stack<Integer>();
        int[] nge = new int[n];
        st.push(n-1);
        nge[n-1] = n;
        for(int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && nums[i] > nums[st.peek()])
                st.pop();
            if (st.size() == 0) nge[i] = n;
            else nge[i] = st.peek();
            st.push(i);
        }
        for(int i = 0; i < n-k+1; i++) {
            int j = i;
            int max = nums[j];
            while(j < i+k) {
                max = nums[j];
                j = nge[j];
            }
            ans[z++] = max;
        }
        return ans;
    }
}
