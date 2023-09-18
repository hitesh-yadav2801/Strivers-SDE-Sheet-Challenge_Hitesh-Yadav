public class Solution {
	static BinaryTreeNode<Integer> prev;
	static BinaryTreeNode<Integer> head;

	static void inOrder(BinaryTreeNode<Integer> root){
		if(root == null) return;
		inOrder(root.left);
		if(prev == null) head = root;
		else {
			root.left = prev;
			prev.right = root;
		}
		prev = root;
		inOrder(root.right);
	}
	public static BinaryTreeNode<Integer> BTtoDLL(BinaryTreeNode<Integer> root) {
		head = null;
		prev = null;
		inOrder(root);
		return head;
	}
	
}
