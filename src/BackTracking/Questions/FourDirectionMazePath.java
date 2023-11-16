package BackTracking.Questions;

public class FourDirectionMazePath {
    public static void main(String[] args) {
       int rows = 3;
       int columns = 3;
       boolean[][] isVisited = new boolean[rows][columns];
       printPath(0, 0, rows-1, columns-1, "", isVisited);
    }

   public static void printPath(int sr, int sc, int er, int ec, String s, boolean[][] isVisited) {
        if (sr < 0 || sc < 0) return;
        if (sr > er || sc > ec) return;

        if (isVisited[sr][sc] == true) return; // this is visited, return from here

        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        // go right
        printPath(sr, sc +1, er, ec, s+"R", isVisited);
        // go down
        printPath(sr +1, sc, er, ec, s+"D", isVisited);
        // go left
        printPath(sr, sc -1, er, ec, s+"L", isVisited);
        // go up
        printPath(sr -1, sc, er, ec, s+"U", isVisited);

        //backtracking
        isVisited[sr][sc] = false;
   }
}
