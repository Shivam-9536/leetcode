// Last updated: 07/04/2026, 17:21:00
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
18        List<List<Integer>> res = new ArrayList<>();
19        if (root == null)
20            return res;
21        Queue<TreeNode> q = new LinkedList<>();
22        q.add(root);
23        int k = 0;
24        while (!q.isEmpty()) {
25            int l = q.size();
26            ArrayList<Integer> al = new ArrayList<>();
27            for (int i = 0; i < l; i++) {
28                TreeNode n = q.poll();
29                if (k % 2 == 0)
30                    al.add(n.val);
31                else
32                    al.add(0, n.val); //reverse effect
33                if (n.left != null) q.add(n.left);
34                if (n.right != null) q.add(n.right);
35            }
36            k++;
37            res.add(al);
38        }
39        return res;
40    }
41}