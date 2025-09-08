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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        
        List<Integer> l=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
         Stack<TreeNode> stack = new Stack<>();
        if(root==null){
            return ans;
        }
        q.add(root);
         boolean flag=true;
        while(!q.isEmpty()){
            int size=q.size();
            l=new ArrayList<>();
           
            for(int i=0;i<size;i++){
                TreeNode x=q.poll();
                if(flag){
                        if(x.left!=null){
                            q.add(x.left);
                        }
                        if(x.right!=null){
                            q.add(x.right);
                        }

                 }
                 else{
                    if(x.right!=null){
                            q.add(x.right);
                        }
                        if(x.left!=null){
                            q.add(x.left);
                        }
                 }
                 l.add(x.val);

                 

            }
           
                    while (!q.isEmpty()) {
                        stack.push(q.poll());
                    }
                    while (!stack.isEmpty()) {
                        q.offer(stack.pop());
                    }
           
         flag=!flag;
            ans.add(l);
        }
    return ans;
    }
}