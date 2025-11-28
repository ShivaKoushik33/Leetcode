class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        int n1=s.length();
        if(n1!=t.length()){
            return false;
        }
        for(int i=0;i<n1;i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
       for (char c : t.toCharArray()) {
            if (!hm.containsKey(c)) return false;  // extra char in t
            hm.put(c, hm.get(c) - 1);
            if (hm.get(c) == 0) hm.remove(c);      // clean up when count is 0
        }

       return hm.isEmpty()==true;
    }
}