class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums[0]<k){
            return -1;
        }
            int max=-1;
            int c=0;
        for(int i=nums.length-1;i>=0;i--){
           int val=nums[i];
           if(val==k){
            return c;
           }
           if(max==val){
            continue;
           }
            else{
                c++;
                max=val;
                
            }
        }
        return c;
    }
}