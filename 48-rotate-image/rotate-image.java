class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int b[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              b[i][j]= matrix[j][i];
            }
        }
        int temp=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                temp=b[i][j];
                b[i][j]=b[i][n-j-1];
                b[i][n-j-1]=temp;
                
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=b[i][j];
            }
        }
    }
}