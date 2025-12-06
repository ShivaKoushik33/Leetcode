class Solution {
    public void fn(int i,int arr[],List<Integer> l,List<List<Integer>> ans,int target){
        if(target==0){
            System.out.println(l);
            ans.add(new ArrayList<>(l));
            return;
           
        }
        if(i>=arr.length){
            return ;
        }
        if(arr[i]<=target){
            l.add(arr[i]);
            fn(i,arr,l,ans,target-arr[i]);
            l.remove(l.size()-1);
        }
        fn(i+1,arr,l,ans,target);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        fn(0,candidates,l,ans,target);
        return ans;
    }
}