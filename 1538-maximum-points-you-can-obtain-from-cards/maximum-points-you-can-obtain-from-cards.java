class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int prefix[]=new int[n];
        int suffix[]=new int[n];
    prefix[0]=cardPoints[0];
    suffix[0]=cardPoints[n-1];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+cardPoints[i];
            suffix[i]=suffix[i-1]+cardPoints[n-i-1];
        }
        int ans=Integer.MIN_VALUE;
        for(int i=1;i<k;i++){
            ans=Math.max(ans,(prefix[i-1]+suffix[k-i-1]));
            // System.out.println(ans);
        }
        ans=Math.max(prefix[k-1],Math.max(ans,suffix[k-1]));
        return ans;
    }
}