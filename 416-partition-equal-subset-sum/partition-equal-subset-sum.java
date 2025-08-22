class Solution {
    Boolean dp[][];
    public boolean part(int i,int nums[],int sum){
        if(sum==0){
            return true;
        }
        if(sum<0 || i>=nums.length){
            return false;
        }
        if(dp[i][sum]!=null){
            return dp[i][sum];
        }

      
        
        boolean take=(part(i+1,nums,sum-nums[i])) ;
       
        boolean leave=(part(i+1,nums,sum));
        return dp[i][sum]=take || leave;
        
        
        
    }
    public boolean canPartition(int[] nums) {
        List l1=new ArrayList<>();
         

        int sum=0;
       for(int x:nums){
        sum+=x;
       }
       if(sum%2!=0){
        return false;
       }
       dp = new Boolean[nums.length][sum + 1];
       
        return part(0,nums,sum/2);
       


    }
}