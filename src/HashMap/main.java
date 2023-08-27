package HashMap;

import java.util.HashMap;
import java.util.Map;

public class main {
    static void HashMapMethods() {
        // Syntax
        Map<String, Integer> mp = new HashMap<String, Integer>();
        // Adding Elements
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Rishika", 19);
        mp.put("Harry", 18);
        System.out.println(mp);
        // Getting value of a key in the Hashmap
        System.out.println(mp.get("Akash"));
        System.out.println(mp.get("Rohan"));

        // Changing/Updating value of a key in the HashMap
        mp.put("Akash", 25); // Akash -> 25
        System.out.println(mp.get("Akash"));

        //Removing a pair from the HashMap
        System.out.println(mp.remove("Akash"));
        System.out.println(mp.remove("Riya"));

        //Checking if a key is in the HashMap
        System.out.println(mp.containsKey("Akash")); //false
        System.out.println(mp.containsKey("Lav"));  // true

        //Adding a new entry only if the new key doesn't exist already
        if (!mp.containsKey("Yashika")) mp.put("Yashika", 30);

        //Get all keys in the HashMap
        System.out.println(mp.keySet());

        //Get all values in the HashMap
        System.out.println(mp.values());

        //Get all entries in the HashMap
        System.out.println(mp.entrySet());

        //Traversing all entries of HashMap - multiple methods
        for(String key: mp.keySet()) {
            System.out.printf("Age of %s is %d\n", key ,mp.get(key));
        }
        System.out.println();
        for(Map.Entry<String, Integer> e : mp.entrySet()) {
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }

    }
    public static void main(String[] args) {
        HashMapMethods();
    }
}
