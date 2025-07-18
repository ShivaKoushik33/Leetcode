class Solution {
    public int[] rearrangeArray(int[] nums) {
        int x=nums.length;
         int y[]=new int[x];
       
       
       int i=0;int j=1;
       
        for(int k=0;k<x;k++){
            if(nums[k]>=0){
                y[i]=nums[k];
                i=i+2;
            }
            
            if(nums[k]<0){
                y[j]=nums[k];
                j=j+2;
            }
            
        }
        return y;
    }
}