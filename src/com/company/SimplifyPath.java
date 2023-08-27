package com.company;

import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        String path = "/a/./b/../../c/";
        System.out.println(simplifyPath(path));
    }
    public static String simplifyPath(String path) {
        Stack<String> st = new Stack<String>();
        StringBuilder str = new StringBuilder();
        String[] p = path.split("/");

        for(int i = 0; i < p.length; i++)
            if (!st.isEmpty() && p[i].equals("..")) st.pop();
         else if
        (!p[i].equals("") && !p[i].equals(".") && !p[i].equals(".."))
            st.push(p[i]);
        if (st.isEmpty())  return "/";
        while(!st.isEmpty()) {
            str.insert(0, st.pop());
            str.insert(0, "/");
        }
        return new String(str);
    }
}
