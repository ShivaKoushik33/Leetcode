/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //BruteForce
class Solution {
    List<Integer> l;
    public boolean fn(TreeNode root, TreeNode p,List<TreeNode> l){
        if(root==null){
            return false;
        }
        l.add(root);
        if(root==p){
            return true;
        }
       
      if(  fn(root.left,p,l) ||   fn(root.right,p,l)) {
        return true;
      }
      
        l.remove(l.size()-1);
        

        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pathP = new ArrayList<>();
        List<TreeNode> pathQ = new ArrayList<>();
        if(root==null){
            return null;
        }
        TreeNode ans=root;
        fn(root,p,pathP);
        fn(root,q,pathQ);
        int size=Math.min(pathP.size(),pathQ.size());

        for(int i=0;i<size;i++){
            if(pathP.get(i)==pathQ.get(i)){
                ans=pathP.get(i);
            }
        }

    //   System.out.println(pathP);
    //     System.out.println(pathQ);

        
        return ans;
    }
}