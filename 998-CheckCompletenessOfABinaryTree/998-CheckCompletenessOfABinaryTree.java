// Last updated: 1/18/2026, 1:43:55 PM
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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean right = false;
        while(!q.isEmpty()){
            int c = q.size();
            for(int i = 0;i<c;i++){
                TreeNode n = q.poll();
                if(n.left==null&&n.right!=null){
                    return false;
                }
                if(right){
                    if(n.left!=null||n.right!=null){
                        return false;
                    }
                }
                if(n.left!=null){
                    q.add(n.left);
                }
                if(n.right!=null){
                    q.add(n.right);
                }
                else{
                    right=true;
                }
                
            }
        }
        return true;
    }
}