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
    
        dp=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                dp[i][j]=-1;
            }
        }
        return fn(0,1,prices,prices.length);
    }
}