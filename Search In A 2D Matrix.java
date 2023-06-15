import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        int m = mat.size(); 
        int n = mat.get(0).size();
        int i = m - 1;
        int j = 0;
        while(i >= 0 && j < n){
            if(mat.get(i).get(j) == target){
                return true;
            } else if(mat.get(i).get(j) > target){
                i--;
            } else if(mat.get(i).get(j) < target){
                j++;
            }
        }
        return false;
    }
}
