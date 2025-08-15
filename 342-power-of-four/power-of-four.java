class Solution {
    public boolean isPowerOfFour(int n) {
        String s=Integer.toBinaryString(n);
        if (n==0) return false;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='1'){
                return false;
            }
        }
        int x=s.length()-1;
        if(x%2==0){
            return true;
        }
        return false;
    }
}