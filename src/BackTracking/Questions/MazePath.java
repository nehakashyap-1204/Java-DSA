package BackTracking.Questions;

public class MazePath {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;

//        int count = maze(1,1,rows, columns);
//        System.out.println(count);

        printMazePath(1,1,rows,columns,"");
    }
    public static int maze(int sr, int sc, int er, int ec) {
        if (sr > er || sc > ec) return 0;
        if (sr == er && ec == er) return 1;
        int downWays = maze(sr +1, sc, er, ec);
        int rightWays = maze(sr, sc +1,er, ec);
        int totalWays = downWays + rightWays;
        return totalWays;
    }
    public static void printMazePath(int sr, int sc, int er, int ec, String s) {
        if (sr > er || sc > ec) return;
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
         // go right
        printMazePath(sr, sc +1, er, ec, s + "R");
        // go down
        printMazePath(sr +1, sc, er, ec, s + "D");
    }
}
