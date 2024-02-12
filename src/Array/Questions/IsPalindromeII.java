package Array.Questions;

public class IsPalindromeII {
    public static void main(String[] args) {
        String s = "abbdebba";
        System.out.println(ispalindrome(s));
    }
    public static boolean ispalindrome(String s){
        int i = 0;
        int j = s.length() -1;
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return palindrome(s, i+1, j) || palindrome(s, i, j-1);
            }
        }
        return true;
    }
    public static boolean palindrome(String s, int i, int j){
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
