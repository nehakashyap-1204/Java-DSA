package GreedyAlgorithm.Questions;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxProfit {

    public static class Item {
        Integer value;
        Integer weight;
        public String toString() {
            return value + " " + weight;
        }
    }

//    public static class ItemComparatoor implements Comparator<Item> {
//        public int compare (Item i1, Item i2) {
//            if ()
//        }
//    }
    public static void main(String[] args) {
        List<Integer> value = new ArrayList<>();
        value.add(60); value.add(100); value.add(150); value.add(120);
        List<Integer> weight = new ArrayList<>();
        weight.add(10); weight.add(20); weight.add(50); weight.add(15);
        List<Item> itemList = new ArrayList<>();
        for (int i = 0; i < value.size(); i++) {
            Item item = new Item();
            item.value = value.get(i);
            item.weight = weight.get(i);
            itemList.add(item);
        }

    }
}
