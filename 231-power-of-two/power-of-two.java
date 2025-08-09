class Solution {
    public boolean isPowerOfTwo(int n) {
        // double x=(Math.log(n)/Math.log(2));
        // boolean ans=x-(int)x==0?true:false;
        return n>0 && (n&(n-1))==0;
    }
}