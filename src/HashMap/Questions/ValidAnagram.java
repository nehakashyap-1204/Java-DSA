package HashMap.Questions;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "silent";
        String t = "listen";
        System.out.println(isAnagram2(s, t));
    }
    public static boolean isAnagram1(String s, String t) { // using 2 maps
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> mp1 = makeFreqMap(s);
        HashMap<Character, Integer> mp2 = makeFreqMap(t);
        return mp1.equals(mp2);
    }
    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> mp = makeFreqMap(s);
        for (int i = 0; i < t.length(); i++) {
            Character ch = t.charAt(i);
            if (!mp.containsKey(ch)) return false;
            int freq = mp.get(ch);
            mp.put(ch, freq -1);
        }
        //all values in map should be 0 for s and t to be anagrams
        for(Integer i : mp.values()) {
            if (i != 0){
                return false;
            }
        }
        return true;
    }

    public static HashMap<Character, Integer> makeFreqMap (String s) {
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!mp.containsKey(ch)) {
                mp.put(ch, 1);
            } else {
                int freq = mp.get(ch);
                mp.put(ch, freq + 1);
            }
        }
        return mp;
    }
}
