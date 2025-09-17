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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<Pair<TreeNode,Integer>> q=new LinkedList<>();
        q.add(new Pair<>(root,0));
        
       
        int ans=Integer.MIN_VALUE;
        while(!q.isEmpty()){
        int size=q.size();    
        int leftInd=0;
        int rightInd=0;
        int min=q.peek().getValue();
            for(int i=0;i<size;i++){
                Pair<TreeNode,Integer> p=q.poll();
               TreeNode temp=p.getKey();
                int idx=p.getValue()-min;
                if(i==0){
                    leftInd=idx;
                }
                if(i==size-1){
                    rightInd=idx;
                }
                
                if(temp.left!=null){
                    q.add(new Pair<>(temp.left,(2*idx+1)));
                }
                 if(temp.right!=null){
                    q.add(new Pair<>(temp.right,(2*idx+2)));
                }
                ans=Math.max(ans,(rightInd-leftInd)+1);
            }
        }
        return ans;
    }
}