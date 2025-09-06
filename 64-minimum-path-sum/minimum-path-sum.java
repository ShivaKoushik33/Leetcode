class Solution {
    int dp[][];
    public int fn(int i,int j,int grid[][]){
        if(i==0&&j==0){
            return grid[0][0];
        }
        int up;
        if(i>0)  up=grid[i][j]+fn(i-1,j,grid);
        else up=Integer.MAX_VALUE;
        int left;
        if(j>0) left=grid[i][j]+fn(i,j-1,grid);
        else left=Integer.MAX_VALUE;

        return Math.min(up,left);
    }
    public int minPathSum(int[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        dp=new int[m][n];
        // return fn(m-1,n-1,grid);

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    dp[i][j]=grid[0][0];
                }
                else{
                    int up;
                    if(i>0)  up=grid[i][j]+dp[i-1][j];
                    else up=Integer.MAX_VALUE;
                    int left;
                    if(j>0) left=grid[i][j]+dp[i][j-1];
                    else left=Integer.MAX_VALUE;

                    dp[i][j]=Math.min(up,left);
                }
            }
        }

        return dp[m-1][n-1];
    }
}