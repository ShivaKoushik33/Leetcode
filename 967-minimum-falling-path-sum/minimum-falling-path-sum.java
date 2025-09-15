class Solution {
    int dp[][];
    public int fn(int i,int j,int m,int n,int arr[][]){
         if(j<0 || j>=n){
            return (int)1e9;
        }
        if(i==0){
            return arr[0][j];
        }
       
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int element=arr[i][j];
        int up=element+fn(i-1,j,m,n,arr);
        int ld=element+fn(i-1,j-1,m,n,arr);
        int rd=element+fn(i-1,j+1,m,n,arr);

        return dp[i][j]=Math.min(up,Math.min(ld,rd));

    }
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        dp=new int[m][n];
        for(int i=0;i<n;i++){
            dp[0][i]=matrix[0][i];
        }
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                int up=matrix[i][j]+dp[i-1][j];
            int ld=(int)1e9;
            int rd=(int)1e9;
              if(j>0){ld=matrix[i][j]+dp[i-1][j-1];}
              if(j<n-1){rd=matrix[i][j]+dp[i-1][j+1];}
              dp[i][j]=Math.min(up,Math.min(ld,rd));
            }
        }

        for(int i=0;i<n;i++){
            ans=Math.min(ans,dp[m-1][i]);
        }
        return ans;
    }
}