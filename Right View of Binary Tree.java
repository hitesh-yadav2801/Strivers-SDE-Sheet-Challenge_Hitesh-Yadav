class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(node, ans, 0);
        return ans;
    }
    void dfs(Node root, ArrayList<Integer> list, int level){
        if(root == null) return;
        
        if(list.size() == level){
            list.add(root.data);
        }
        dfs(root.right, list, level + 1);
        dfs(root.left, list, level + 1);
    }
}
