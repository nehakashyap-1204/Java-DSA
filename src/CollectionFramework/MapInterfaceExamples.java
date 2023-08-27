package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceExamples {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<Integer, String>();
        mp.put(1, "neha");
        mp.put(2, "aman");
        mp.put(3, "rohan");
        mp.put(1, "riya"); // over-rides
        //  Iterating over keys in a map
//        for(Integer i : mp.keySet()) {
//            System.out.println(i);
//        }
        //  Iterating over values in a map
        for(String st : mp.values()) {
            System.out.print(st+" ");
        }

//        System.out.println(mp.entrySet());
//        System.out.println(mp.get(3));
//        System.out.println(mp.containsKey(6));
//        System.out.println(mp.containsValue("rahul"));
//        System.out.println(mp.keySet());
//        System.out.println(mp.values());
    }
}
