struct TreeNode {
  int val;
  TreeNode *left;
  TreeNode *right;
  TreeNode(int x) : val (x), left(NULL), right(NULL {}
};

#include <iostream>
#include <string>

class BinaryTreePaths {
public:
    void traverse(TreeNode * root, string a, vector<string> & vect) {
        a += std::to_string(root->val);
        if (root->left != NULL || root->right != NULL) {
            a += "->";
            if (root->left != NULL) {
                traverse(root->left, a, vect);
            }
            if (root->right != NULL) {
                traverse(root->right, a, vect);
            }
        }
        if (root->left == NULL && root->right == NULL) {
            vect.push_back(a);
        }
    }

    vector<string> binaryTreePaths(TreeNode* root) {
        vector<string> vect;
        if (root == NULL) {
            return vect;
        }
        string a = "";
        traverse(root, a, vect);
        return vect;
    }

};
