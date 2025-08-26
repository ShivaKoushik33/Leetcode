class Solution {
    int dp[][];
    public int fn(int i,int coins[],int amount){
        if(i>=coins.length){
            return 0;
        }
        if(amount==0){
            return 1;
        }
        if(dp[i][amount]!=-1){
            return dp[i][amount];
        }
        int x=0;
        int y=0;
        if(coins[i]<=amount){
            x=fn(i,coins,amount-coins[i])+fn(i+1,coins,amount);
        }
        else{
            y=fn(i+1,coins,amount);
        }

        return dp[i][amount]=x+y;

    }
    public int change(int amount, int[] coins) {
        dp=new int[coins.length+1][amount+1];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
       return fn(0,coins,amount);
    }
}