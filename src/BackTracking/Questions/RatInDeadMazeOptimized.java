package BackTracking.Questions;

public class RatInDeadMazeOptimized {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        int[][] maze = {
                {1,0,1},
                {1,1,1},
                {1,1,1}
        };
        printPath(0,0,rows -1, columns -1,"", maze);
    }
    public static void printPath(int sr, int sc, int er, int ec, String s, int[][] maze) {
        if (sr < 0 || sc < 0) return;
        if (sr > er || sc > ec) return;
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        if (maze[sr][sc] == -1) return;
        if (maze[sr][sc] == 0) return;
        maze[sr][sc] = -1;
        // go right
        printPath(sr, sc +1, er, ec, s + "R", maze);
        // go down
        printPath(sr +1, sc, er, ec, s + "D", maze);
        // go left
        printPath(sr, sc -1, er, ec, s + "L", maze);
        // go up
        printPath(sr -1, sc, er, ec, s + "U", maze);

        // backtracking
        maze[sr][sc] = 1;
    }
}
