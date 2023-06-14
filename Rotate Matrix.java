import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int row = 0;
        int col = 0;
        int lastRow = n;
        int lastCol = m;
        int prev, cur;

        while(row < lastRow - 1 && col < lastCol - 1){
            
            prev = mat.get(row+1).get(col);
            for(int i = col; i < lastCol; i++){
                cur = mat.get(row).get(i);
                mat.get(row).set(i, prev);
                prev = cur;
            }
            row++;
            for(int i = row; i < lastRow; i++){
                cur = mat.get(i).get(lastCol-1);
                mat.get(i).set(lastCol-1, prev);
                prev = cur;
            }
            lastCol--;
            if(row < lastRow){
                for(int i = lastCol-1; i >= col; i--){
                    cur = mat.get(lastRow-1).get(i);
                    mat.get(lastRow-1).set(i, prev);
                    prev = cur;
                }
            }
            lastRow--;
            if(col < lastCol){
                for(int i = lastRow-1; i >= row; i--){
                    cur = mat.get(i).get(col);
                    mat.get(i).set(col, prev);
                    prev = cur;
                }
            }
            col++;
        }
    }
}
