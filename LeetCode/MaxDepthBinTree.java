private class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) {val = x ;}
}

public class MaxDepthBinTree {

  public static void main(String[] args) {




  }
  public static boolean sameTree(TreeNode p, TreeNode q) {
     if(p == null && q == null) return true;
     if(p == null || q == null) return false;
     if(p.val == q.val)
         return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
     return false;
  }
}
