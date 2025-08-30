class Solution {
    public int minInsertions(String s) {
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String rev=sb.toString();
       List<Character> l=new ArrayList<>();
        int n=s.length();
        int dp[][]=new int[n+1][n+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                if(s.charAt(i-1)==rev.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        } 


        return s.length()-dp[n][n];
    }
}