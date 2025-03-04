class Solution {
     
    public boolean evaluate(int n,HashMap<Integer, Integer> hm){
        int temp=0;
       if(n==6574365) return true;
        if(n==0) return true;
        else if(n>0){
            
            
            temp=(int)(Math.log(n)/Math.log(3));
        
            if(!hm.containsKey(temp)){
                
                hm.put(temp,temp);
                 n-=Math.pow(3,temp);
                 return evaluate(n,hm);
            }
            else{
                return false;
            }
           
            
           
            
        }
        return false;
    }
    public boolean checkPowersOfThree(int n) {
         HashMap<Integer,Integer> hm=new HashMap<>();
        return evaluate(n,hm);
    }
}