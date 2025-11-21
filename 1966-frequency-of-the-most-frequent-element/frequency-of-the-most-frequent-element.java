class Solution {
    public int maxFrequency(int[] nums, int k) {
        int l=0;
        int r=0;
        int ans=0;
        long sum=0;
        Arrays.sort(nums);
        while(r<nums.length){
             sum+=nums[r];

            while((long)nums[r]*(r-l+1)>sum+k){
                sum-=nums[l];
                l++;
            }
            ans=Math.max(ans,(r-l+1));
            r++;
        }
        return ans;
    }
}