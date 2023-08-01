package Stacks.Questions;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] findNextGreaterElement(int[] arr) {
        int[] output = new int[arr.length];
//        Arrays.fill(output, -1);
        Stack<Integer> str = new Stack<Integer>();
        for (int i = arr.length -1; i >= 0 ; i--) {
            output[i] = -1;
            while (!str.isEmpty() && arr[i] >= arr[str.peek()]){
                str.pop();
            }
            if (!str.isEmpty()){
                output[i] = arr[str.peek()];
            }
            str.push(i);
        }
        return output;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 8, 1, 6, 5, 9, 7};
        int[] result = findNextGreaterElement(arr);
        System.out.println(Arrays.toString(result));
    }
}
