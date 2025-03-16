class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
           
                hm.put(nums2[i],-1);
            
        }
        for(int i=0;i<nums2.length;i++){
            while(!st.isEmpty()&&st.peek()<=nums2[i]){
                hm.put(st.peek(),nums2[i]);
                st.pop();
            }
            st.push(nums2[i]);
            
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=hm.get(nums1[i]);
        }
        return nums1;
    }
}