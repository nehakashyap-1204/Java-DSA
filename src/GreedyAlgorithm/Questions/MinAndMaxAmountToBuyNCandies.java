package GreedyAlgorithm.Questions;

import java.util.Arrays;

public class MinAndMaxAmountToBuyNCandies {
    public static void main(String[] args) {
        int[] price = {3,2,1,4};
        int k = 2;
        findMin(price, k);
        findMax(price, k);
    }
    public static void findMin(int[] price, int k){
        int n = price.length;
        int res = 0;
        Arrays.sort(price);
        for (int i = 0; i < k; i++) {
            res += price[i];
        }
        System.out.println("Minimum " + res + " candies you have to buy to get all candies");
    }
    public static void findMax(int[] price, int k){
        int n = price.length;
        int res = 0;
        Arrays.sort(price);
        for (int i = n -1; i >= k ; i--) {
            res += price[i];
        }
        System.out.println("Maximum " + res + " candies you have to buy to get all candies");
    }
}
