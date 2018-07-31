private class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) {val = x;}
}
public class SecondMinimumNode {
    ArrayList<Integer> list = new ArrayList<Integer>();
    public int findSecondMinimumValue(TreeNode root) {

        addToSet(root);
        Collections.sort(list);
        int first = list.get(0);
        for(int i = 1; i < list.size(); i++) {
            if(list.get(i) != first) {
                return list.get(i);
            }
        }
        return -1;
    }
    public void addToSet(TreeNode root) {
        if(root == null) {
            return;
        }
        addToSet(root.left);
        list.add(root.val);
      //  System.out.println(root.val);
        addToSet(root.right);
    }
}
