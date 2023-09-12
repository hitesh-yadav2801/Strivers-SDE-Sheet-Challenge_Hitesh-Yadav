class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);

        int cur = height(root.left) + height(root.right); 
        return Math.max(cur, Math.max(ld, rd));
    }

    public int height(TreeNode root) {
        if (root == null) return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}
