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
    
    public TreeNode searchBST(TreeNode root, int val) {
        
        if(root==null){
                return null;
        }
        
        TreeNode left=searchBST(root.left,val);
        TreeNode right=searchBST(root.right,val);
        if(root.val==val){
            return root;
        }
        if(left!=null){
            return left;
        }
        if(right!=null){
            return right;
        }

        return null;
    }
}