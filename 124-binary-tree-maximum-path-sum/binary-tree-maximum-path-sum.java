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
    int ans;
    public int fn(TreeNode root){
         if(root==null){
            return 0;
        }
        int leftSum=fn(root.left);
        int rightSum=fn(root.right);
        // ans=Integer.MIN_VALUE;
        if(leftSum<0){
            leftSum=0;
        }
        if(rightSum<0){rightSum=0;}
        ans=Math.max(ans,root.val+leftSum+rightSum);
        return root.val+Math.max(leftSum,rightSum);
    }
    public int maxPathSum(TreeNode root) {
        ans=Integer.MIN_VALUE;
       fn(root);
       return ans;
    }
}