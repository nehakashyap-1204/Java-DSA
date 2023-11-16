package HashSet;

import java.util.HashSet;

public class basics {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<String>();
        st.add("Neha");
        st.add("Aditi");
        st.add("Riya");
        st.add("Bunny");
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.contains("Aditi"));
        st.remove("Riya");
        System.out.println(st);
        for(String str : st) {
            System.out.println(str);
        }
    }
}
