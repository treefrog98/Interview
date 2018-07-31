private class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) {val = x;}
}


public class PathSum {

  public static void main(String[] args) {


  }

  public static boolean hasPathSum(TreeNode root, int sum) {
    if(root == null) {
      return false;
    }
    if(root.val == sum) {
      if(root.left == null || root.right == null) {
        return false;
      }
    }
    return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right,sum-root.val;
  }

}
