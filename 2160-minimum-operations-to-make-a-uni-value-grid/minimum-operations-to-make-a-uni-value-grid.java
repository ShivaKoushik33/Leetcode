class Solution {
    public int countOperations(int[] flat,int x,int median,int m){
        int rem=flat[0]%x,c=0;
        for(int i:flat){
            c+=Math.abs(i-median)/x;

        }
        return c;

    }
    public int median(int[] flat,int m,int x){
         Arrays.sort(flat);
       int median = flat[(m) / 2]; 
    //    System.out.println(median);
        return countOperations(flat, x, median,m);

    }
    public int minOperations(int[][] grid, int x) {
        int m=grid.length;
        int n=grid[0].length;
        
        int flat[]=new int [m*n];

    int count=0;
    int val=grid[0][0]%x;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                flat[count++]=grid[i][j];
                if(grid[i][j]%x!=val){
                    return -1;
                }
            }
        }
       
    return median(flat,m*n,x);
    }

}