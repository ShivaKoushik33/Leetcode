class Solution {
    int dp[][];
    public int fn(int i,int j,List<List<Integer>> triangle){
        if(i==triangle.size()-1){
            return triangle.get(i).get(j);
        }
        if(dp[i][j]!=Integer.MAX_VALUE){
            return dp[i][j];
        }
        int first;
        int second;

        if(i>triangle.size()){
            first=Integer.MAX_VALUE;
        }
        else first=triangle.get(i).get(j)+fn(i+1,j,triangle);
        if(i>triangle.size()){
            second=Integer.MAX_VALUE;
        }
        else second=triangle.get(i).get(j)+fn(i+1,j+1,triangle);
        return dp[i][j]=Math.min(first,second);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size()==1){
            return triangle.get(0).get(0);
        }
        int m=triangle.size();
         dp= new int[m][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=Integer.MAX_VALUE;
            }
        }

        fn(0,0,triangle);
          //  return fn(0,0,triangle);
        //    for(int i=0;i<m;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(dp[i][j] +" ");
        //     }
        //     System.out.println();
        // }
         
          return dp[0][0];
    }
}