class Solution {
    int div=1000000007;
    public long fn(long n,long x){
            long copy=n;
            long ans=1;
            x%=div;
            while(n>0){
                if(n%2==1){
                    ans=(ans*x)%div;
                    n=n-1;
                }
                else{
                    x=(x*x)%div;
                    n=n/2;
                }
            }
        return ans;
    }
    public int countGoodNumbers(long n) {
        long odd=n/2;
        long even=(n+1)/2;
        long ans=1;
        if(odd!=0){
             ans=(ans*fn(odd,4))%div;
        }
        if(even!=0){
            ans=(ans*fn(even,5))%div;
        }
        // ans+=fn(odd,4);
        
        return (int)ans%div;

    }
}