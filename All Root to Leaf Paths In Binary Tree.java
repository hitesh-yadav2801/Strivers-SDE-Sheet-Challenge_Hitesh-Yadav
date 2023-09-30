/********************************************************************

 Following is the class structure of the Node class:

 class BinaryTreeNode {
     int data;
     BinaryTreeNode left;
     BinaryTreeNode right;

     BinaryTreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
 };

 ********************************************************************/
import java.util.ArrayList;
import java.util.List;
public class Solution {
    public static List<String> allRootToLeaf(BinaryTreeNode root) {
        ArrayList<String> ans = new ArrayList<>();
        dfs(root, ans, "");
        return ans;
    }
    static void dfs(BinaryTreeNode root, ArrayList<String> ans, String temp){
        if(root == null) return;
        
        if(temp.length() == 0){
            temp += root.data;
        } else{
            temp += " " + root.data;
        }
        if(root.left == null && root.right == null){
            ans.add(temp);
            return;
        }
        dfs(root.left, ans, temp);
        dfs(root.right, ans, temp);
    }
}
