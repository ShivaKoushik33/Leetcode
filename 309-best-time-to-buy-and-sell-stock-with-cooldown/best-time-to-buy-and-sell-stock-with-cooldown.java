class Solution {
    int dp[][][];
    public int fn(int index,int bought,int prices[],int n,int cool){
        if(index==n){
            return 0;
        }
        if(bought==1 && cool==0){
            return Math.max(-prices[index]+fn(index+1,0,prices,n,cool),fn(index+1,1,prices,n,cool));
        }
        else if(bought==0 && cool==0){
            return Math.max(+prices[index]+fn(index+1,0,prices,n,1),fn(index+1,1,prices,n,cool));
        }
        else{
            return fn(index+1,bought,prices,n,0);
        }

        
        
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        dp=new int[n+1][2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                dp[n][i][j]=0;
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                     if(j==1 &&k==0){
                        dp[i][j][k]=Math.max(-prices[i]+dp[i+1][0][k],dp[i+1][1][k]);
                     }
                     else if(j==0 && k==0){
                        dp[i][j][k]=Math.max(prices[i]+dp[i+1][1][1],dp[i+1][0][k]);
                     }
                     else{
                        dp[i][j][k]=dp[i+1][j][0];
                     }
                }
            }
        }
        return dp[0][1][0];
        // return fn(0,1,prices,n,0);
    }
}