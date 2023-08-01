package Stacks.Questions;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {
    public static int[] calculateStockSpan(int[] prices) {
        int[] spans = new int[prices.length];
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] >= prices[stack.peek()]) {
                stack.pop();
            }

            spans[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        return spans;
    }
    public static void main(String[] args) {
        int[] stockPrices = {70,80,60,100,90,70,40};
        int[] spans = calculateStockSpan(stockPrices);
        System.out.println(Arrays.toString(spans));
    }


}
