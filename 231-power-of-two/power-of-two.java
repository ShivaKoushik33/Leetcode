class Solution {
    public boolean isPowerOfTwo(int n) {
        // if (n==0) return false;
        // if(Math.floor(Math.log(n)/Math.log(2))==Math.ceil(Math.log(n)/Math.log(2))){
        //     return true;
        // }
        // return false;
        return n > 0 && (n & (n - 1)) == 0;
    }
}