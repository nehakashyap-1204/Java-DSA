package Array.Questions;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountingFrequencies {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int n = arr.length;
        countFreq2(arr, n);
    }
    public static void countFreq(int[] arr, int n) { // TC = O(N^2)
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);
        // traverse through array elements and count frequencies
        for (int i = 0; i < n; i++) {
            // skip the element if already processed
            if (visited[i] == true) continue;
            // count frequencies
            int count = 1;
            for (int j = i +1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i]+" "+count);
        }
    }
    public static void countFreq2(int[] arr , int n){ // TC = O(N)
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                int num = map.get(arr[i]);
                map.put(arr[i], num + 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
