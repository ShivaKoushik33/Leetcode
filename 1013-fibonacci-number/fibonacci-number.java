class Solution {
    public int fn(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fn(n-2)+fn(n-1);
    }
    public int fib(int n) {
        return fn(n);
    }
}