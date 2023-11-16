package HashMap.Questions;

import java.util.HashMap;

public class LargestSubarrayWith0Sum {
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, -25};
        System.out.println(largestSubarray(arr));
    }
    public static int largestSubarray(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, -1);
        int prefSum = 0;
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            if (map.containsKey(prefSum)) {
                maxLength = Math.max(maxLength, i - map.get(prefSum));
            } else {
                map.put(prefSum, i);
            }
        }
        return maxLength;
    }
}
