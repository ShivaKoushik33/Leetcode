class Solution {
    int t[]=new int[102];
    public int fun(int i,int nums[],int n){
        if(i>=n){
            return 0;
        }

        if(t[i]!=-1){
            return t[i];
        }
        int rob=nums[i]+fun(i+2,nums,n);
        int skip=fun(i+1,nums,n);
        
        return t[i]=Math.max(rob,skip);
    }
    public int rob(int[] nums) {
        Arrays.fill(t,-1);
        
       return  fun(0,nums,nums.length);
    }
    
}