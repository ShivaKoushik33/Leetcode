class Solution {
    int dp[][][];
    public int fn(int index,int buy,int count,int n,int prices[]){
        if(count==2 || index==n){
            return 0;
        }
        if(buy==1){
            return Math.max(-prices[index]+fn(index+1,0,count,n,prices),fn(index+1,1,count,n,prices));
        }
        else{
            return Math.max(prices[index]+fn(index+1,1,count+1,n,prices),fn(index+1,0,count,n,prices));
        }
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        dp=new int[n+1][2][3];
        // return fn(0,1,0,n,prices);
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                dp[i][j][2]=0;
            }
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                dp[n][i][j]=0;
            }
        }

        for(int i=n-1;i>=0;i--){
            for(int j=0;j<2;j++){
                for(int k=1;k<3;k++){
                    if(j==1){
                    dp[i][j][k]=Math.max(-prices[i]+dp[i+1][0][k],dp[i+1][1][k]);
                }
                else{
                    dp[i][j][k]=Math.max(prices[i]+dp[i+1][1][k-1],dp[i+1][0][k]);
                }
                }
                
            }
        }

        return dp[0][1][2];
    }
}