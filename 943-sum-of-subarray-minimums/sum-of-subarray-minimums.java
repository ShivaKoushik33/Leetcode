class Solution {
   
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int MOD = 1_000_000_007;
        int [] nle=new int[arr.length];
        long count=0;
        int [] ple=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty()&& arr[st.peek()]>arr[i]){
                st.pop();
            }
            ple[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty()&& arr[st.peek()]>=arr[i]){
                st.pop();
            }
            nle[i]=st.isEmpty()?arr.length:st.peek();
            st.push(i);
        }
        for(int i=0;i<arr.length;i++){
            long left = i - ple[i];   
            long right = nle[i] - i;  
            count=(count+(arr[i]*left%MOD)*right%MOD)%MOD;
            

        }
        
        
        return (int)count;
    }
    
    
}