import java.util.ArrayList;

public class Solution {
    public static ArrayList<ArrayList<Integer>> solveNQueens(int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int[][] board = new int[n][n];
        solve(0, board, ans, n);
        return ans;
    }
    static void solve(int col, int[][] board, ArrayList<ArrayList<Integer>> ans, int n){
        // Base case
        if(col == n){
            addSol(ans, board, n);
            return;
        }
        for(int row = 0; row < n; row++){
            if(isSafe(row, col, board, n)){
                board[row][col] = 1;
                solve(col + 1, board, ans, n);
                // Backtrack
                board[row][col] = 0;
            }
        }
    }
    static void addSol(ArrayList<ArrayList<Integer>> ans, int[][] board, int n){
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp.add(board[i][j]);
            }
        }
        ans.add(temp);
    }
    static boolean isSafe(int row, int col, int[][] board, int n){
        int x = row;
        int y = col;
        while(y >= 0){
            if(board[x][y] == 1){
                return false;
            }
            y--;
        }
        x = row;
        y = col;
        while(y >= 0 && x >= 0){
            if(board[x][y] == 1){
                return false;
            }
            y--;
            x--;
        }
        x = row;
        y = col;
        while(y >= 0 && x < n){
            if(board[x][y] == 1){
                return false;
            }
            y--;
            x++;
        }
        return true;
    }
}
