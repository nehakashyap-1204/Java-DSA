package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterfaceExamples {
    public static void main(String[] args) {
//        HashSet<Integer> st = new HashSet<Integer>();
//        LinkedHashSet<Integer> st = new LinkedHashSet<Integer>();
        TreeSet<Integer> st = new TreeSet<Integer>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(55);
        st.add(42);
        st.add(99);
        st.add(85);
        System.out.println(st);
//        st.remove(4);
//        System.out.println(st);
//        System.out.println(st.contains(6));
//        System.out.println(st.size());
    }
}
