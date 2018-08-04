

 struct TreeNode {
     int val;
     TreeNode *left;
     TreeNode *right;
     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
  };

#include <iostream>
class FindBottomLeftValue {

public:
    int heightOfTree(TreeNode* root) {
        if(root == NULL){
            return -1;
        }
        else {
            int leftHeight = heightOfTree(root->left)+1;
            int rightHeight = heightOfTree(root->right) + 1;
            if(leftHeight > rightHeight) {
                return leftHeight;
            }
            return rightHeight;
        }
    }

    int treeTraversal(TreeNode* root, int currentLevel, int treeHeight) {
        if(root == NULL) {
            return -1;
        }
        if (currentLevel == treeHeight) {
            return root->val;
        }

        int left = treeTraversal(root->left, currentLevel + 1, treeHeight);
        int right = treeTraversal(root->right, currentLevel + 1, treeHeight);
        if (left != -1) {
            return left;
        } else {
            return right;
        }
        // std::cout<<root->val<<std::endl;
    }

    int findBottomLeftValue(TreeNode* root) {
        int treeHeight = heightOfTree(root);
        return treeTraversal(root, 0, treeHeight);
    }


};
