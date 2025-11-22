class Solution {
    public int maxSubArray(int[] nums) {
        int local_sum=0;
        int global_max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            local_sum+=nums[i];
            if(local_sum>global_max){
                global_max=local_sum;
            }
            if(local_sum<0){
                local_sum=0;
            }

        }
        return global_max;
    }
}