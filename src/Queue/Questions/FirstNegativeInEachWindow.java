package Queue.Questions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeInEachWindow {
    public static void main(String[] args) {
        int[] A = {12,-1,-7,8,15,30,-16,28};
        int n = A.length;
        int k = 3;
        int[] ans = printFirstNegativeInteger(A, n, k);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] printFirstNegativeInteger(int[] A, int n, int k) {
        int[] res = new int[n-k+1];
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            if (A[i] < 0) {
                q.add(i);
            }
        }
        for (int i = 0; i < n-k+1; i++) {
            if (q.size() > 0 && q.peek() < i)
                q.remove();
            if (q.size() > 0 && q.peek() <= i+k-1)
                res[i] = A[q.peek()];
            else if (q.size() == 0) res[i] = 0;
            else res[i] = 0;
        }
        return res;
    }
}
