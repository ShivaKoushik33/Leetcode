class Solution {
    public void rec(int i,int arr[],int target,List<List<Integer>> ans,List<Integer> l,int k){
        if(target==0 && k==0){
            ans.add(new ArrayList<>(l));
            return ;
        }
        if(i==arr.length ){
            return ;
        }
        if((target!=0 && k==0) ||(target==0 && k!=0)){
            return ;
        }
        if(arr[i]>target){
            return ;
        }
        
        l.add(arr[i]);
        k=k-1;
        rec(i+1,arr,target-arr[i],ans,l,k);
        l.remove(l.size()-1);
        k=k+1;
        rec(i+1,arr,target,ans,l,k);
    }


    public void fn(int ind,int k,int n,int a[],List<List<Integer>> ans,List<Integer> l){
        if((k==0 &&n==0)){
            ans.add(new ArrayList<>(l));
            return ;
        }
        if((k==0 &&n!=0)||(k!=0 &&n==0)){
            return ;
        }
        

        for(int i=ind;i<a.length;i++){
            if (a[i] > n) break;
            l.add(a[i]);
            fn(i+1,k-1,n-a[i],a,ans,l);
            l.remove(l.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int a[]={1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        // rec(0,a,n,ans,l,k);
        fn(0,k,n,a,ans,l);
        return ans;
    }
}