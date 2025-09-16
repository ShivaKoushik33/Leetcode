class Solution {
    int dp[][][];
    public int fn(int index,int buy,int count,int n,int prices[],int k){
        if(count==k || index==n){
            return 0;
        }
        if(buy==1){
            return Math.max(-prices[index]+fn(index+1,0,count,n,prices,k),fn(index+1,1,count,n,prices,k));
        }
        else{
            return Math.max(prices[index]+fn(index+1,1,count+1,n,prices,k),fn(index+1,0,count,n,prices,k));
        }
    }
    public int maxProfit(int k, int[] prices) {
         int n=prices.length;
        dp=new int[n+1][2][k+1];
        // return fn(0,1,0,n,prices,k);
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                dp[i][j][k]=0;
            }
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<k+1;j++){
                dp[n][i][j]=0;
            }
        }

        for(int i=n-1;i>=0;i--){
            for(int j=0;j<2;j++){
                for(int q=1;q<k+1;q++){
                    if(j==1){
                    dp[i][j][q]=Math.max(-prices[i]+dp[i+1][0][q],dp[i+1][1][q]);
                }
                else{
                    dp[i][j][q]=Math.max(prices[i]+dp[i+1][1][q-1],dp[i+1][0][q]);
                }
                }
                
            }
        }
        return dp[0][1][k];
    }
}