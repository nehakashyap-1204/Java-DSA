package DP.Questions;

import java.util.Arrays;

public class FibonacciNumber2 {
    //Tabulation :-
    public static void main(String[] args) {
        int n = 7;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n ; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[n]);   //TC = O(N)  SC = O(N)

        System.out.println(secondMethod(n));
    }
    public static int secondMethod(int n){
        int prev2 = 0;
        int prev = 1;
        for (int i = 2; i <= n ; i++) {
            int curri = prev + prev2;
            prev2 = prev;
            prev = curri;
        }
        return prev;   //TC = O(N)  SC = O(1)
    }

}
