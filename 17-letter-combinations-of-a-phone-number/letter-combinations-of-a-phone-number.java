class Solution {
    
    public void rec(HashMap<Integer,String> hm,int j,List<Character> l,List<String> ans,int product,HashMap<Integer,Integer> num){
        if(l.size()==num.size()){
            String s="";
            for(char x:l){
                s=s+x;
            }
            ans.add(s);
            return ;
        }
        int outer=num.get(j);
     
        String y=hm.get(outer);
        for(int i=0;i<y.length();i++){
            String x=hm.get(outer);
            l.add(x.charAt(i));
            rec(hm,j+1,l,ans,product,num);
            l.remove(l.size()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        
        HashMap<Integer,String> hm=new HashMap<>();
        HashMap<Integer,Integer> num=new HashMap<>();
        
        List<Character> l=new ArrayList<>();
        List<String> ans=new ArrayList<>();
        if(digits.length()==0){
            return ans;
        }
        int product=1;
         hm.put(2, "abc");
        hm.put(3, "def");
        hm.put(4, "ghi");
        hm.put(5, "jkl");
        hm.put(6, "mno");
        hm.put(7, "pqrs");
        hm.put(8, "tuv");
        hm.put(9, "wxyz");
        for(int i=0;i<digits.length();i++){
            int x=digits.charAt(i)-'0';
            // System.out.println(x*2);
           product*=hm.get(x).length();
            num.put(i,x);
        }
       
        //  rec(hm,j+1,l,ans,product)
        // System.out.println(product+"product");
        rec(hm,0,l,ans,product,num);

        return ans;

    }
}