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

    int maxJ;
    public void fn(TreeNode root,int i,int j,TreeMap<Integer,List<int []>> hm){
     
        if(root==null){
            return;
        }
        if(hm.get(j)==null){
            hm.put(j,new ArrayList<int []>());
        }
        hm.get(j).add(new int[]{i,root.val});
        fn(root.left,i+1,j-1,hm);
        fn(root.right,i+1,j+1,hm);

    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,List<int []>> hm=new TreeMap<>();
        List<Integer> q;
        List<List<Integer>> ans=new ArrayList<>();
        fn(root,0,0,hm);
    //         for (int key : hm.keySet()) {
    //     System.out.print(key + " -> ");
    //     for (int[] arr : hm.get(key)) {
    //         System.out.print(Arrays.toString(arr) + " ");
    //     }
    //     System.out.println();
    // }
    for(int key:hm.keySet()){
        q=new ArrayList<>();
        Collections.sort(hm.get(key), (a, b) -> {
    if (a[0] == b[0]) return a[1] - b[1]; // same row → sort by value
    return a[0] - b[0];                   // otherwise → sort by row
});
        for(int[] arr:hm.get(key)){
            q.add(arr[1]);
        }
        ans.add(q);
    }




        




        return ans;
    }
}