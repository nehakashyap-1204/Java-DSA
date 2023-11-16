package HashMap.Questions;

import java.util.ArrayList;
import java.util.LinkedList;
public class HashMapImplementation {
    static class MyHashMap<K, V>{ //generics
//        public static final int DEFAULT_CAPACITY = 4;
//        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node{
            K key;
            V value;
           public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
        private int n; //n - nodes
        private int N; //N - buckets
        private LinkedList<Node> buckets[]; //N - buckets.length

        public MyHashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<Node>();
            }
        }
        private int hashFunction(K key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }
        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }
        private void rehash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];

            for (int i = 0; i < N*2; i++) {
                buckets[i] = new LinkedList<Node>();
            }

            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }
        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) { // key doesn't exist
                buckets[bi].add(new Node(key, value));
                n++;
            } else { // key exist
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            double lambda = (double)n/N;
            if (lambda > 2.0) {
                rehash();
            }
        }
        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) { // key doesn't exist
               return null;
            } else { // key exist
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }
        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) { // key doesn't exist
                return false;
            } else { // key exist
                Node node = buckets[bi].get(di);
                return true;
            }
        }
        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) { // key doesn't exist
                return null;
            } else { // key exist
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<K>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty() {
            return n == 0;
        }
        public int size() {
            return n;
        }
    }
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<String, Integer>();
        map.put("India", 100);
        map.put("China", 120);
        map.put("US", 85);
        System.out.println(map.size());
        System.out.println(map.get("India"));
        System.out.println(map.get("Pak"));

//        ArrayList<String> keys = map.keySet();
//        for (int i = 0; i < keys.size(); i++) {
//            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
//        }
    }
}
