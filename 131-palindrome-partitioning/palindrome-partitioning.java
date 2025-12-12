class Solution {
    public void fn(int ind,String s,List<String> l,List<List<String>> ans){
        if(ind==s.length()){
            ans.add(new ArrayList<>(l));
            return ;
        }
        for(int i=ind;i<s.length();i++){
            if(isPalindrome(ind,i,s)){
                l.add(s.substring(ind,i+1));
                fn(i+1,s,l,ans);
                l.remove(l.size()-1);
            }
        }
    }
    public boolean isPalindrome(int l,int r,String s){
        while(l<r){
            char x=s.charAt(l);
            char y=s.charAt(r);
                if(x==y){
                    l++;
                    r--;
                }
                else{
                    return false;
                }
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<String> l=new ArrayList<>();
        List<List<String>> ans=new ArrayList<>();
        fn(0,s,l,ans);
    return ans;
    }
}