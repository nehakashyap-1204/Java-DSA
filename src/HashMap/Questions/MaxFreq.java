package HashMap.Questions;

import java.util.HashMap;
import java.util.Map;

public class MaxFreq {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,4,1};
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for(Integer el : arr) {
            if (!freq.containsKey(el)){
                freq.put(el, 1);
            } else {
                freq.put(el, freq.get(el) + 1);
            }
        }
        System.out.println("Frequency Map :");
        System.out.println(freq.entrySet());
        int maxFreq = 0, ansKey = -1;
        for(Integer key : freq.keySet()) {
            if (freq.get(key) > maxFreq) {
                maxFreq = freq.get(key);
                ansKey = key;
            }
        }
        System.out.printf("%d has max frequency and it occurs %d times", ansKey, maxFreq);
    }
}
