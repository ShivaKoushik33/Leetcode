class Solution {
    public boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        int arr[]=new int[2];
        arr[0]=-1;
        arr[1]=-1;
        List<Integer> l=new ArrayList<>();
        int j=0;
        
        for(int i=left;i<=right;i++){
            if(isPrime(i)){
                if(i!=1){
                     l.add(i);
                }
               
            }
            
        }
      
       int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<l.size()-1;i++){
            
                 int diff=l.get(i+1)-l.get(i);
                    if(diff<minDiff){
                        minDiff=diff;
                    arr[0]=l.get(i);
                    arr[1]=l.get(i+1);
                    if(minDiff==1){
                        return arr;
                    }
                    }
                    
            
        }
    return arr;
    }
}