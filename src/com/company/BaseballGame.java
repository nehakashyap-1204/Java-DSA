package com.company;

import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {
        String[] operations = {"5","2","C","D","+"};
        System.out.println(calPoints(operations));
    }
    public static int calPoints(String[] operations){
        Stack<Integer> st = new Stack<Integer>();
        for(String s : operations) {
            if (s.equals("C")) {
                st.pop();
            } else if (s.equals("D")) {
                int temp = st.peek() * 2;
                st.push(temp);
            } else if (s.equals("+")) {
                int v1 = st.pop();
                int v2 = st.pop();
                int sum = v1 + v2;
                st.push(v2);
                st.push(v1);
                st.push(sum);
            } else {
                int val = Integer.parseInt(s);
                st.push(val);
            }
        }
        int ans = 0;
        while (!st.isEmpty()) {
            ans += st.pop();
        }
        return ans;
    }
}
