/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */               
class Solution {
    public void fn(HashMap<TreeNode,TreeNode> hm,TreeNode root,TreeNode parent){
        if(root==null){
            return ;
        }
        hm.put(root,parent);
        fn(hm,root.left,root);
        fn(hm,root.right,root);
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans=new ArrayList<>();
        HashMap<TreeNode,TreeNode> hm=new HashMap<>();
        fn(hm,root,root);
    //    for(TreeNode x:hm.keySet()){
    //     TreeNode p=hm.get(x);
    //     System.out.println(x.val+" "+p.val);
    //    }
    Queue<TreeNode> q=new LinkedList<>();
    Set<TreeNode> hs=new HashSet<>();
    q.add(target);

    while(!q.isEmpty() && k!=0){
        int size=q.size();
        k--;
        for(int i=0;i<size;i++){
            TreeNode temp=q.poll();
            hs.add(temp);

            if(hm.containsKey(temp) && !hs.contains(hm.get(temp))){
                q.add(hm.get(temp));
            }
            if(temp.left!=null && !hs.contains(temp.left)){
                q.add(temp.left);
            }
            if(temp.right!=null && !hs.contains(temp.right)){
                q.add(temp.right);
            }
        }
    }
    for(TreeNode x:q){
        ans.add(x.val);
        // System.out.println(x.val);
    }
        return ans;
    }
}