class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      ArrayList<Integer> ans = new ArrayList<>();
      dfs(root, ans, 0);
      return ans;
    }
    void dfs(Node root, ArrayList<Integer> list, int level){
        if(root == null) return;
        
        if(list.size() == level){
            list.add(root.data);
        }
        dfs(root.left, list, level + 1);
        dfs(root.right, list, level + 1);
    }
}
