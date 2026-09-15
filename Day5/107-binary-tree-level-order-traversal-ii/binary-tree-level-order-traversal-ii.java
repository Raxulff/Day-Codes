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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        Stack<List<Integer>> stack = new Stack<>();
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            
            for(int st = 1;st<=size;st++){
                TreeNode polled = queue.poll();
                level.add(polled.val);

                if(polled.left != null){
                    queue.add(polled.left);
                }
                if(polled.right != null){
                    queue.add(polled.right);
                }
            }
            stack.push(new ArrayList<>(level));
        }
        while(!stack.isEmpty()){
            ans.add(stack.pop());
        }
        return ans;
    }
    
}
