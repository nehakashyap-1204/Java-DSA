package BackTracking.Questions;

public class RatInDeadMaze {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 6;
        int[][] maze = {
                {1,0,1,1,1,1},
                {1,1,1,1,0,1},
                {0,1,1,1,1,1},
                {0,0,1,0,1,1}
        };
        printPath(0,0,rows -1, columns -1,"", maze);
    }
    public static void printPath(int sr, int sc, int er, int ec, String s, int[][] maze) {
        if (sr > er || sc > ec) return;
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        if (maze[sr][sc] == 0) return;
        // go right
        printPath(sr, sc +1, er, ec, s + "R", maze);
        // go down
        printPath(sr +1, sc, er, ec, s + "D", maze);
    }
}
