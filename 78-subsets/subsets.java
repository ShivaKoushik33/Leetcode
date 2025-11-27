class Solution {
    public void sub(int i,int []nums,ArrayList l, List<List<Integer>> ans){
          
            if(i==nums.length){
                if(ans.add(new ArrayList<>(l)));
                return ;
            }
            l.add(nums[i]);
            sub(i+1,nums,l,ans);
            l.remove(l.size()-1);
            sub(i+1,nums,l,ans);

            // return ans;
    }
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> l=new ArrayList<>();
         List<List<Integer>> ans=new ArrayList<>();
           List<Integer> temp;
         int n=nums.length;
        for(int i=0;i<(1<<n);i++){
                temp=new ArrayList<>();;
            for(int j=0;j<n;j++){

                    if(((1<<j)&i)!=0){
                        temp.add(nums[j]);
                    }
            }
            ans.add(temp);
        }
        // sub(0,nums,l,ans);
        return ans;
    }
}