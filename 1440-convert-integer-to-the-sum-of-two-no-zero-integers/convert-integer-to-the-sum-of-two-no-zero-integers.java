class Solution {
    public boolean zero(int n){
        while(n!=0){
            int temp=n%10;
            if(temp==0){
                return false;
            }
            n=n/10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        int a[]=new int[2];
        // int x=n/2;
       

        for(int i=1;i<=n;i++){
            if(zero(i)){
                 int x=n-i;
                 if(zero(x)){
                     a[0]=i;
                    a[1]=x;
                    break;
                 }
            }
        }
        return a;   
    }
}