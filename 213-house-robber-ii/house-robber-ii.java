class Solution {
    int t[]=new int[102];
    public int rec(int nums[],int i,int n){
        if(i>n){
            return 0;
        }
        if(t[i]!=-1){
            return t[i];
        }
        int rob=nums[i]+rec(nums,i+2,n);
        int skip=rec(nums,i+1,n);

        return t[i]=Math.max(rob,skip);

    }
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Arrays.fill(t,-1);
        int n=nums.length;
       int x= rec(nums,0,n-2);
       Arrays.fill(t,-1);
       int y=rec(nums,1,n-1);
       return Math.max(x,y);
    }
}