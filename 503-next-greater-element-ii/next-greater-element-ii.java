class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];
        HashMap<Integer, Integer> hm = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            int id = i % n;

            while (!st.isEmpty() && st.peek()<=nums[id]) {
                st.pop();
            }
            
            if(i<n){
                nge[id]=st.isEmpty()?-1:st.peek();
            }
                st.push(nums[id]);
        }
        
        
        return nge;
    }
}