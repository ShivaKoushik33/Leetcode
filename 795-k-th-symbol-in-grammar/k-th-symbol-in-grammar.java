class Solution {
    public int rec(int n,int k){
        if(n==1 || k==1){
            return 0;
        }
        int mid=(int)(Math.pow(2,n-1))/2;
        if(k<=mid){
         return rec(n-1,k);
        }
        else{
          return 1-rec(n-1,k-mid);
        }
        
    }
    public int kthGrammar(int n, int k) {
        return rec(n,k);
        
    }
}