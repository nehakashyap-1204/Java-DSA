package BackTracking.Questions;

public class RatInDeadMazeFourDirection {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 4;
        int[][] maze = {
                {1,0,1,1},
                {1,1,1,1},
                {1,1,0,1}
        };
        boolean[][] isVisited = new boolean[rows][columns];
        printPath(0,0,rows -1, columns -1,"", maze, isVisited);
    }
    public static void printPath(int sr, int sc, int er, int ec, String s, int[][] maze, boolean[][] isVisited) {
        if (sr < 0 || sc < 0) return;
        if (sr > er || sc > ec) return;
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        if (isVisited[sr][sc] == true) return;
        if (maze[sr][sc] == 0) return;
        isVisited[sr][sc] = true;
        // go right
        printPath(sr, sc +1, er, ec, s + "R", maze, isVisited);
        // go down
        printPath(sr +1, sc, er, ec, s + "D", maze, isVisited);
        // go left
        printPath(sr, sc -1, er, ec, s + "L", maze, isVisited);
        // go up
        printPath(sr -1, sc, er, ec, s + "U", maze, isVisited);

        // backtracking
        isVisited[sr][sc] = false;
    }
}
