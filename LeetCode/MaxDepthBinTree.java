private class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) {val = x ;}
}

public class MaxDepthBinTree {

  public static void main(String[] args) {




  }
  public static int MaxDepthBinTree(TreeNode root) {
    if(root == null) {
      return 0;
    }
    else {
      return ((MaxDepthBinTree(root.left)+1) > (MaxDepthBinTree(root.right)+1)) ? MaxDepthBinTree(root.left)+1 : MaxDepthBinTree(root.right) + 1;
    }
  }
}
