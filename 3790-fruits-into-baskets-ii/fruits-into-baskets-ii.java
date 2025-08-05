class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count=baskets.length;
        int mark[]=new int[baskets.length];
        Arrays.fill(mark,-1);
        for(int j=0;j<fruits.length;j++){
            for(int i=0;i<baskets.length;i++){
                if(fruits[j]<=baskets[i] && mark[i]!=1){
                    mark[i]=1;
                    count--;
                    break;
                }
            }
        }
        
        return count;
    }
}