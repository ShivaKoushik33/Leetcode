class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        if(s.length()%2!=0) return false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                if(st.size()!=0&&st.peek()=='('){
                    st.pop();
                    continue;
                }
                else{
                    return false;
                }
            }
            else if(s.charAt(i)=='}'){
                if(st.size()!=0&&st.peek()=='{'){
                    st.pop();
                    continue;
                }
                else{
                    return false;
                }
            }
            else if(s.charAt(i)==']'){
                if(st.size()!=0&&st.peek()=='['){
                    st.pop();
                    continue;
                }
                else{
                    return false;
                }
            }
            st.push(s.charAt(i));
        }
        return st.size()==0?true:false;
    }
}