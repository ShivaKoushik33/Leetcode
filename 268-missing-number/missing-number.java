class Solution {
    public int missingNumber(int[] nums) {
        int max=nums.length;
        int sum=0;
        for(int i=0;i<nums.length;i++){
                
                sum=sum+nums[i];
        }
        int result=(max*(max+1))/2;
        if((result-sum)==0) return 0;
        return result-sum;
    }
}