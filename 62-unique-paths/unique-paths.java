class Solution {
    int dp[][];
    public int fn(int i,int j,int m,int n){
        if((i==m-1 && j==n-1)||(i==m-1)||(j==n-1)){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int x=fn(i+1,j,m,n);
        int y=fn(i,j+1,m,n);
        return dp[i][j]=x+y;
    }

    public int uniquePaths(int m, int n) {
        dp=new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                dp[i][j]=-1;
            }
        }
        return fn(0,0,m,n);
    }
}