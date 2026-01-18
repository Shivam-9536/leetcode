// Last updated: 1/18/2026, 1:45:11 PM
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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer>ans=new ArrayList<>();
        preorder(root,ans);
        return ans;
    }
    public void preorder(TreeNode node,ArrayList<Integer>ans){
        if(node==null){
            return;
        }
     
        ans.add(node.val);
        preorder(node.left,ans);
        preorder(node.right,ans);
    }
}
