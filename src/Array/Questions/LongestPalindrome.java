package Array.Questions;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(palindrome(s));
    }
    public static int palindrome(String s){
        int[] count = new int[128];
        for(char ch : s.toCharArray()) {
            count[ch]++;
        }
        int oddCount = -1;
        for(int v : count) {
            if (v % 2 != 0) oddCount++;
        }
        return (oddCount > 0) ? s.length() - oddCount : s.length();
    }
}
