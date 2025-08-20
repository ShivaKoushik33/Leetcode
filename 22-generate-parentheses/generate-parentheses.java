class Solution {
    char x='(';
    char y=')';
    public void generate(int left,int right,List<String> ans,List<Character> l){
        
        if(left>right){
            return ;
        }
        if(left==0 && right==0){
            String s="";
            for(char x:l){
                s+=x;
            }
            ans.add(s);
            return ;
        }
        if(left>=0 &&right>=0){
            l.add(x);
        generate(left-1,right,ans,l);
        l.remove(l.size()-1);
        l.add(y);
        generate(left,right-1,ans,l);
        l.remove(l.size()-1);
        }
        
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        List<Character> l=new ArrayList<>();
        generate(n,n,ans,l);
        return ans;
        
    }
}