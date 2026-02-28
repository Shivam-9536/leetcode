// Last updated: 28/02/2026, 20:21:16
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumRootToLeaf(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null)
            return root.val;
        if (root.left != null) root.left.val += root.val * 2;
        if (root.right != null) root.right.val += root.val * 2;
        return sumRootToLeaf(root.left) + sumRootToLeaf(root.right);
    }
}