class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=-1;;
        if(target<matrix[0][0] || target>matrix[matrix.length-1][0] ){
            row=matrix.length-1;
        }
        else{
            for(int i=0;i<matrix.length;i++){
        if(target==matrix[i][0]) return true;
        if(target<matrix[i][0]){
            row=i-1;
            break;
        }
      } 

        }
        
      
    //   if (row==-1) return false;
    if(row==-1){row=0;}
      for(int i=0;i<matrix[row].length;i++){
        if(target==matrix[row][i]){
            return true;
        }
      } 
      return false;
    }
}