class Solution {
    static int t[]=new int[47];
    public int fun(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return t[1];
        }
        for(int i=3;i<n+1;i++){
            t[i]=t[i-1]+t[i-2];
        }
        
        
        return t[n];
    }
    public int climbStairs(int n) {
        t[0]=0;
        t[1]=1;
        t[2]=2;
       

        return fun(n);
    }
}