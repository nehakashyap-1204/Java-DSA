package Array.Questions;

public class MinMaxInArray {
    public static void main(String[] args) {
        int[] arr = {4, 2, 0, -8, 20, 9, 2, 50};
        MinMax(arr);
    }
    public static void MinMax(int[] arr) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Minimum value: "+ min);
        System.out.println("Maximum value: "+ max);
    }
}
