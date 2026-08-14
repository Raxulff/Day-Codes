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
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        // If the left child is null, we must find the depth of the right subtree
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }
        
        // If the right child is null, we must find the depth of the left subtree
        if (root.right == null) {
            return 1 + minDepth(root.left);
        }
        
        // If both children exist, we can safely take the minimum of the two depths
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}