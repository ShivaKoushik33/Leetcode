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
     public void fn(TreeNode root,int i,int j,TreeMap<Integer,List<int []>> hm){
     
        if(root==null){
            return;
        }
        if(hm.get(i)==null){
            hm.put(i,new ArrayList<int []>());
        }
        hm.get(i).add(new int[]{j,root.val});
        fn(root.left,i+1,j-1,hm);
        fn(root.right,i+1,j+1,hm);

    }
    public List<Integer> rightSideView(TreeNode root) {
          TreeMap<Integer,List<int []>> hm=new TreeMap<>();
        List<Integer> l=new ArrayList<>();
         fn(root,0,0,hm);
      int ans=0;
      //printing the data
    //   for(int key:hm.keySet()){
    //     System.out.print(key+" -> ");
    //     for(int arr[]:hm.get(key)){
    //         System.out.print(Arrays.toString(arr)+" ");
    //     }
    //     System.out.println();
    //   }
         for(int key:hm.keySet()){
                // Collections.sort(hm.get(key), (a, b) -> {
                //     if (a[0] == b[0]) return a[1] - b[1]; 
                //         return a[0] - b[0];                   
                //         });
            for(int[] arr:hm.get(key)){
                    // q.add(arr[1]);
                    ans=arr[1];
                }
        l.add(ans);
    }
    return l;    
    }
}