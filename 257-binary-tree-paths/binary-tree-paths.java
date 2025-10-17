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
    // public boolean isLeaf(TreeNode root){
    //     if(root.left==null && root.right==null){
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }
    public void fn(TreeNode root,String temp,List<String> ans){
        if(root==null){
            return ;
        }
        if(root.left==null && root.right==null){
            temp+=root.val;
            ans.add(temp);
        }
        else{
            temp+=root.val;
            temp+="->";
            
                 fn(root.left,temp,ans);
            
            
                fn(root.right,temp,ans);
            
           
            
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        String temp="";
        fn(root,temp,ans);
        return ans;
        
    }
}