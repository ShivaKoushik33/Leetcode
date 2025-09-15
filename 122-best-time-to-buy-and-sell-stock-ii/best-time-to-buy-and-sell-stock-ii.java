class Solution {
    int dp[][];
    public int fn(int index,int buy,int prices[],int n){
        if(index ==n){
            return 0;
        }
        if(dp[index][buy]!=-1){
            return dp[index][buy];
        }
        if(buy==1){
           return dp[index][buy]=Math.max(-prices[index]+fn(index+1,0,prices,n),fn(index+1,1,prices,n));
        }
        else{
           return dp[index][buy]=Math.max(prices[index]+fn(index+1,1,prices,n),fn(index+1,0,prices,n));
        }
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        dp=new int[n+1][2];
      dp[n][0]=0;
      dp[n][1]=0;

        // int ans=fn(0,1,prices,prices.length);
         for(int i=n-1;i>=0;i--){
            for(int j=0;j<2;j++){
                if(j==1){
                    dp[i][j]=Math.max(-prices[i]+dp[i+1][0],dp[i+1][1]);
                }
                else{
                    dp[i][j]=Math.max(prices[i]+dp[i+1][1],dp[i+1][0]);
                }
            }
        }
        return dp[0][1];
    }
}