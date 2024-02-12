package GreedyAlgorithm.Questions;

public class SurviveOnIsland {
    public static void main(String[] args) {
        int S = 10;  //No. of days
        int N = 16;  //monday - saturday buy
        int M = 2;  //daily consumption

        int total_food_required = S * M;
        int result;
        // if (1 week consumption > 1 week buy) -> you can't survive
        if ((M > N) || (7 * M) > (6 * N)) {
            result = -1;
        } else {
            result = (int)Math.ceil((double)total_food_required / N);
        }
        System.out.println(result);
    }
}
