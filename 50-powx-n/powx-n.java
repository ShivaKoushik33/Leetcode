class Solution {
    public double myPow(double x, int n) {
        double ans=1.0;
        long copy=n;
        if(copy<0){
            copy=-1*copy;
        }
        while(copy>0){
            if(copy%2==1){
                ans=ans*x;
                copy=copy-1;
            }
            else{
                x=x*x;
                copy=copy/2;
            }
        }
        if(n<0){
            ans=(double)1/ans;
        }
        return ans;
    }
}