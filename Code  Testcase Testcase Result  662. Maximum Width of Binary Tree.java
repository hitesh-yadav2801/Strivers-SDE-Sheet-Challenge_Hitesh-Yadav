class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        ArrayDeque<Pair> q = new ArrayDeque<>();
        int max = 0;
        q.add(new Pair(root, 0));

        while(!q.isEmpty()){
            int l = q.peekFirst().idx;
            int r = q.peekLast().idx;
            max = Math.max(max, r - l + 1);

            int n = q.size();
            while(n-- > 0){
                Pair top = q.poll();
                if(top.node.left != null){
                    q.add(new Pair(top.node.left, 2 * top.idx + 1));
                }
                if(top.node.right != null){
                    q.add(new Pair(top.node.right, 2 * top.idx + 2));
                }
            }
        }
        return max;
    }
    class Pair{
        TreeNode node;
        int idx;

        public Pair(TreeNode node, int idx){
            this.node = node;
            this.idx = idx;
        }
    }
}
