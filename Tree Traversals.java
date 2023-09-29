import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Solution {
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>(); 
        for (int i = 0; i < 3; i++) {
            ans.add(new ArrayList<>());
        }
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root, 1));

        while(!st.isEmpty()){
            Pair top = st.pop();
            int num = top.num;
            if(num == 1){
                ans.get(1).add(top.node.data);
                top.num++;
                st.push(top);
                if(top.node.left != null){
                    st.push(new Pair(top.node.left, 1));
                }
            } else if(num == 2){
                ans.get(0).add(top.node.data);
                top.num++;
                st.push(top);
                if(top.node.right != null){
                    st.push(new Pair(top.node.right, 1));
                }
            } else {
                ans.get(2).add(top.node.data);
            }
        }
        return ans;
    }
    static class Pair{
        TreeNode node;
        int num;
        
        public Pair(TreeNode node, int num){
            this.node = node;
            this.num = num;
        }
    }
}
