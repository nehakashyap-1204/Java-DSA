package HashSet;

import java.util.HashSet;

public class MaxNumbersOnTable {
    public static void main(String[] args) {
        int[] nums = {2,1,1,3,2,3};
        System.out.println( maxNumbers(nums));
    }
    public static int maxNumbers(int[] bag) {
        HashSet<Integer> tabel = new HashSet<Integer>();
        int max = 0;
        for (int i = 0; i < bag.length; i++) {
            int num = bag[i];
            if (tabel.contains(num)) {
                tabel.remove(num);
            } else {
                tabel.add(num);
                max = Math.max(max, tabel.size());
            }
        }
        return max;
    }
}
