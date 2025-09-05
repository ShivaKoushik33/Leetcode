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
    int ans=Integer.MIN_VALUE;
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        ans=Math.max(ans,(left+right));
        return 1+Math.max(left,right);
    }
    public void fn(TreeNode root){
        if(root==null){
            return ;
        }
        int left=height(root.left);
        int right=height(root.right);
        ans=Math.max(ans,(left+right));
        fn(root.left);
        fn(root.right);

    }
   
    public int diameterOfBinaryTree(TreeNode root) {
       height(root);
         

        return ans;
    }

}