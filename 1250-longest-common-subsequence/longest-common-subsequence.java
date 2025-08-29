class Solution {
    int dp[][];
    public int fn(String s1,String s2,int m,int n){
        if(n==0 || m==0){
            return 0;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
    
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return dp[m][n]=1+fn(s1,s2,m-1,n-1);
        }
        else{
            return dp[m][n]=Math.max(fn(s1,s2,m,n-1),fn(s1,s2,m-1,n));
        }


    }
    public int longestCommonSubsequence(String text1, String text2) {
        // System.out.println(text1.length()+"hello"+text2.length());
        dp=new int[text1.length()+1][text2.length()+1];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        return fn(text1,text2,text1.length(),text2.length());
    }
}