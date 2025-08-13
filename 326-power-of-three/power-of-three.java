class Solution {
    public boolean isPowerOfThree(int n) {

        // if(n<0){
        //     return false;
        // }
        // double x=Math.log(n)/Math.log(3);
        // if((x-(int)x)==0){
        //     return true;
        // }
        
        return n>0 && Math.pow(3,31)%n==0;
    }
}