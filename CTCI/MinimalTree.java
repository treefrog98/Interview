import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class MinimalTree {
	private static class TreeNode {
		private int v;
		public TreeNode left;
		public TreeNode right;
		public TreeNode(TreeNode left, TreeNode right, int v) {
			this.left = left;
			this.right = right;
			this.v = v;
		}
		public TreeNode(int v) {
			this.left = null;
			this.right = null;
			this.v = v;
		}
		public String toString() {
			return v + "";
		}
	}
	public static void main(String[] args) {

		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		TreeNode a = minimalTree(arr,0,arr.length-1);
		ArrayList<ArrayList<Integer>> result = levelOrderTraversal(a);
		for(int i = 0; i < result.size(); i++) {
			for(int val : result.get(i)) {
				System.out.print(val + " ");
			}
			System.out.println();
		}

	}


	public static TreeNode minimalTree(int [] arr, int left, int right) {
		if(left == right) {
			return new TreeNode(arr[left]);
		}
		// test for the 2nd one
		if(right == left+1) {
			return new TreeNode( null, new TreeNode(arr[right]), arr[left]);
		}
		int mid = (left + right)/2;
		TreeNode root = new TreeNode(arr[mid]);
		root.left = minimalTree(arr, left, mid-1);
		root.right = minimalTree(arr, mid+1, right);
		return root;

	}
	public static int height(TreeNode root) {
		if(root == null) {
			return -1;
		}
		return Math.max((height(root.right)+1), height(root.left)+1);
	}
	public static void inOrderTraversal(TreeNode root) {
		if(root != null) {
			inOrderTraversal(root.left);
			System.out.print(root.v + " ");
			inOrderTraversal(root.right);
		}
	}
	public static ArrayList<ArrayList<Integer>> levelOrderTraversal(TreeNode root) {
		ArrayList<ArrayList<Integer>> traversal = new ArrayList<>();
		for(int i = 0; i < height(root)+1; i++) {
			traversal.add(new ArrayList<>());
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			if (queue.peek().left != null) {
				queue.add(queue.peek().left);
			}
			if (queue.peek().right != null) {
				queue.add(queue.peek().right);
			}
			int h = height(queue.peek());
			traversal.get(traversal.size()-h-1).add(queue.peek().v);
			queue.remove();
		}
		return traversal;
	}

}
