class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            hm.put(x,hm.getOrDefault(x,0)+1);
        }


        List<Map.Entry<Character,Integer>> l=new ArrayList<>(hm.entrySet());



        Collections.sort(l,(a,b)->{return b.getValue()-a.getValue();});
        StringBuilder ans=new StringBuilder("");
       for(Map.Entry<Character,Integer> x:l){
                int val=x.getValue();
                char a=x.getKey();
                while(val>0){
                    ans.append(a);
                    val--;
                }
       }
        
        // System.out.println();
        return ans.toString();
    }
}