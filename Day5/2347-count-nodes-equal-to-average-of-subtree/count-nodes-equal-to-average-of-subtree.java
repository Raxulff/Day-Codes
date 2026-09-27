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
    public int averageOfSubtree(TreeNode root) {
        int count = 0;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            TreeNode curr = qu.poll();
            int a = helper(curr);
            int b = totalNode(curr);
            if(a/b==curr.val) count++;
    
            if(curr.left!=null) qu.add(curr.left);
            if(curr.right!=null) qu.add(curr.right);
            
        }
        return count;
    }
    private int helper(TreeNode root){
        if(root==null) return 0; 
        if(root.left==null && root.right==null) return root.val; 
        return root.val + helper(root.left)+helper(root.right);
    }
    private int totalNode(TreeNode root){
        if(root==null) return 0; 
        return 1 + totalNode(root.left)+totalNode(root.right);
    }
}