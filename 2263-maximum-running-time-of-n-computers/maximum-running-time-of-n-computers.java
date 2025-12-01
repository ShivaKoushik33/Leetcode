class Solution {
    public boolean fn(long x,long n,int batteries[]){
        long total=0;
        for(int i:batteries){
            total+=Math.min(x,i);
        }
        return total>=n*x;
    }
    public long maxRunTime(int n, int[] batteries) {
        Arrays.sort(batteries);
        long totalSum=0;
        for(int i:batteries){
            totalSum+=i;
        }
        long max_possible=totalSum/n;
       
        long l=0;
        long h=totalSum/n;
        long ans=0;
        while(l<=h){
            long mid=(l+h)/2;
            if(fn(mid,n,batteries)){
                ans=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return ans;

    }
}