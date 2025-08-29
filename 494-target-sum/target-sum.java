class Solution {
    int dp[][];
    public int fn(int i,int nums[],int target){
            if(i==nums.length){
                if(target==0){
                    return 1;
                }else{
                    return 0;
                }
            }
            if(i>=nums.length){
                return 0;
            }

            int leave=fn(i+1,nums,target);
            int take=0;
            if(nums[i]<=target){
                 take=fn(i+1,nums,target-nums[i]);
            }
            return take+leave;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        double t=(target+sum)/2.0;
        if(t-(int)t!=0){
            return 0;
        }
        int val=(target+sum)/2;
        return fn(0,nums,val);

    }
}