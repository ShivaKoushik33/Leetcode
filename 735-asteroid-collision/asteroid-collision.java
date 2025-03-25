class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st =new Stack<>();
        int n=asteroids.length;
        // int flag;
        for(int i=0;i<n;i++){
            // st.push(asteroids[i]);
            if(asteroids[i]>0){
                st.push(asteroids[i]);
        
            }
            else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(asteroids[i])){
                    st.pop();
                }
                if(!st.isEmpty()&& st.peek()==Math.abs(asteroids[i])){
                    st.pop();
                }
                else if(st.isEmpty()||st.peek()<0){
                    st.push(asteroids[i]);
                }
            }
        
        
        }
        int[] a = new int[st.size()];
        int i = st.size() - 1;
        while (!st.isEmpty()) {
            a[i--] = st.pop();
        }
        return a;
    }
}