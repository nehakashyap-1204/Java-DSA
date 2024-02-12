package GreedyAlgorithm.Questions;

import java.util.ArrayList;
import java.util.List;

public class LargestPalindrome {
    public static void main(String[] args) {
        String number = "3155136";
        List<Integer> frequency = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            frequency.add(0);
        }
        int n = number.length();
        for (int i = 0; i < n; i++) {
            int digit = number.charAt(i) - '0';
            frequency.set(digit, frequency.get(digit) +1);  //increasing freq by 1
        }
        if (!isValidate(frequency)) {
            System.out.println("Palindrome not possible");
            return;
        }
        String firstHalf = "";
        for (int i = 9; i >= 0 ; i--) {
            while (frequency.get(i) > 1) {
                firstHalf += i;
                frequency.set(i, frequency.get(i) -2);
            }
        }
        StringBuilder sb = new StringBuilder(firstHalf);
        sb.reverse();
        String secondHalf = sb.toString();

        for (int i = 9; i >= 0 ; i--) {
            if (frequency.get(i) == 1) {
                firstHalf += i;
            }
        }
        String result = firstHalf + secondHalf;
        System.out.println(result);
    }
    public static boolean isValidate(List<Integer> frequency){
        boolean isOdd = false;
        for (int i = 0; i < frequency.size(); i++) {
            if (frequency.get(i) % 2 != 0) {
                if (isOdd == true) {
                    return false;
                }
                isOdd = true;
            }
        }
        return true;
    }
}
