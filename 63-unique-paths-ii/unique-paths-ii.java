class Solution {
      int dp[][];
     public int fn(int i,int j,int m,int n,int arr[][]){
       if(arr[i][j]==1){
        return 0;
       }
        if((i==m-1 && j==n-1)){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int x=0;
        int y=0;
        if(i+1<m && arr[i+1][j]!=1){
            System.out.println("if block");
             x=fn(i+1,j,m,n,arr);
        }
        if(j+1<n && arr[i][j+1]!=1){
             System.out.println("else block");
             y=fn(i,j+1,m,n,arr);
        }
       
        return dp[i][j]=x+y;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
         if(obstacleGrid[m-1][n-1]==1 || obstacleGrid[0][0]==1){
            return 0;
        }
          dp=new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                dp[i][j]=-1;
            }
        }
        return fn(0,0,m,n,obstacleGrid);
    }
}