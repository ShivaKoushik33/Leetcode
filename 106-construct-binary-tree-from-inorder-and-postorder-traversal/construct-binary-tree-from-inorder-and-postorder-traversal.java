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
    HashMap<Integer,Integer> hm;
    int index;
    public TreeNode fn(int preorder[],int start,int end){
        if(start>end){
            return null;
        }
        int rootVal=preorder[index--];
        TreeNode root=new TreeNode(rootVal);
        int inIndex=hm.get(rootVal);
        root.right=fn(preorder,inIndex+1,end);
        root.left=fn(preorder,start,inIndex-1);

        return root;

    }
     
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         hm=new HashMap<>();
        
        int n=postorder.length;
        index=n-1;
        for(int i=0;i<n;i++){
            hm.put(inorder[i],i);
        }
        return fn(postorder,0,n-1);
        
    }
}