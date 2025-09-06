class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int ans=Integer.MIN_VALUE;
        for(int i=1;i<prices.length;i++){
            if(buy<=prices[i]){
               ans=Math.max(ans,prices[i]-buy);
            }
            else{
                buy=prices[i];
            }
        }

        return ans==Integer.MIN_VALUE?0:ans;
    }
}