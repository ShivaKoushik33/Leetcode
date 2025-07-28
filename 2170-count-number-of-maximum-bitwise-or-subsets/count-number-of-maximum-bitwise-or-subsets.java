class Solution {
     public int rec(int i,int nums[],int or,int target){
            if(i==nums.length){
                if(or==target){
                    return 1;
                }
                else{
                    return 0;
                }
            }
          
            int a=rec(i+1,nums,nums[i] | or,target);
      
            int b=rec(i+1,nums, or,target);
            return a+b;
     }

    public int countMaxOrSubsets(int[] nums) {
        int sum=0;
       for(int i=0;i<nums.length;i++){
        sum=sum | nums[i];
       } 
       return rec(0,nums,0,sum);
    }
}