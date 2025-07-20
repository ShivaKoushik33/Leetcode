class Solution {
    public int islandPerimeter(int[][] grid) {
        int sum=0;
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                
            
                if(grid[i][j]==1){
                count=4;

                    if(i>0 && grid[i-1][j]==1){
                        count--;
                    }
                    if(j>0 && grid[i][j-1]==1){
                        count--;
                    }
                    if(i<grid.length-1 && grid[i+1][j]==1){
                        count--;
                    }
                    if(j<grid[0].length-1&&grid[i][j+1]==1){
                        count--;
                    }
                }
                sum+=count;
                count=0;
            }
            
            
        }
        return sum;
    }
}