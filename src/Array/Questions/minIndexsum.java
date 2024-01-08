package Array.Questions;

import java.util.ArrayList;
import java.util.HashMap;

public class minIndexsum {
    public static void main(String[] args) {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"KFC","Shogun","Burger King"};
        String[] ans = findRestaurant(list1, list2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
            for(int i=0; i<list1.length; i++){
                map.put(list1[i], i);
            }
            int min = Integer.MAX_VALUE;
            ArrayList<String> str = new ArrayList<>();
            for(int i=0; i<list2.length; i++){
                if(map.containsKey(list2[i])){
                    int sum = map.get(list2[i])+i;
                    if(sum < min){
                        min = sum;
                        str.clear();    //This deletes all elements of arraylist
                        str.add(list2[i]);
                    }
                    else if(min == sum){
                        str.add(list2[i]);
                    }
                }
            }
            return str.toArray(new String[0]);
    }
}
