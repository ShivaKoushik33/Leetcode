class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int nge[]=new int[nums.length];
        for(int i=0;i<n;i++){
            nge[i]=-1;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<i+n;j++){
                int idx=j%n;
                if(nums[i]<nums[idx]){
                    nge[i]=nums[idx];
                    break;
                }
            }
        }
        return nge;
    }
}