class Solution {
    public long fn(int nums[],int index){
        long sum=0;
        for(int i=0;i<(index+1)/2;i++){
            sum+=(nums[index-i]-nums[i]);
        }
        return sum;
    }
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        if(n%2==0){
            return fn(nums,n-1);
        }
        
        return (nums[n-1])+fn(nums,n-2);
        
    }
}