class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int val=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            int cal=Math.abs(nums[i+1]-nums[i]);
            if((cal)>val){
                val=cal;
            }
        }
        if(val<(Math.abs(nums[nums.length-1]-nums[0]))){
            val=Math.abs(nums[nums.length-1]-nums[0]);
        }
        return val;
    }
}