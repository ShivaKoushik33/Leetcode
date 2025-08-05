class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        // HashMap<Integer,Integer> hm=new HashMap<>();
        // for(int i=0;i<baskets.length;i++){
        //     hm.put(baskets[i],i);
        // }
        int count=0;
        int mark[]=new int[baskets.length];
        Arrays.fill(mark,-1);
        for(int j=0;j<fruits.length;j++){
            for(int i=0;i<baskets.length;i++){
                if(fruits[j]<=baskets[i] && mark[i]!=1){
                    System.out.println(fruits[j] +"  "+baskets[i]);
                    mark[i]=1;
                    break;
                }
            }
        }
        for(int i=0;i<mark.length;i++){
            if(mark[i]==-1){
                count++;
            }
        }
        return count;
    }
}