package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ListInterfaceExamples {
    static void ArrayListExamples() {
//        ArrayList<Integer> l = new ArrayList<Integer>();
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        l.add(2,10);
        System.out.println(l);
        l.remove(2);
        System.out.println(l);
        System.out.println(l.get(2));
        l.set(1,99);
        System.out.println(l);
        System.out.println(l.contains(3));
    }
    static void StackExamples() {
        Stack<String> st = new Stack<String>();
        st.push("neha");
        st.push("kashyap");
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.isEmpty());
    }
    public static void main(String[] args) {
//        ArrayListExamples();
        StackExamples();
    }
}
