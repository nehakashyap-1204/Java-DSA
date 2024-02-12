package GreedyAlgorithm.Questions;

import java.util.Arrays;
import java.util.Comparator;

public class BuyMaximumStocksOnIthDay {
    public static void main(String[] args) {
        int[] pairs = {10,7,19};
        System.out.println("Numbers of stocks you can buy = " + buyMaximumProducts(45, pairs));
    }

        public static int buyMaximumProducts(int k, int[] price) {
            int pairs[][]=new int[price.length][2];
            for(int i=0;i<price.length;i++){
                pairs[i][0]=price[i];
                pairs[i][1]=i+1;
            }
//
            Arrays.sort(pairs, Comparator.comparingDouble(o->o[0]));
            int count = 0;
            int remainingmoney = k;
            for(int i = 0; i < price.length; i++){
                int stockvalue = pairs[i][0] * pairs[i][1];
                if(remainingmoney >= stockvalue){
                    count += pairs[i][1];
                    remainingmoney -= stockvalue;
                }
                else if(remainingmoney >= pairs[i][0]){
                    int val = pairs[i][0];
                    while(remainingmoney >= val){
                        count++;
                        remainingmoney -= val;
                    }
                }
            }
            System.out.println("Remaining Money = " + remainingmoney);
            return count;

        }

}
