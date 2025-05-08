class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      HashMap<Integer,Integer> hm=new HashMap<>();
       Deque<Integer> st=new ArrayDeque<>();
       int a[]=new int[nums1.length];
       for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty()&&st.peek()<=nums2[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                hm.put(nums2[i],st.peek());
            }
            else{
                hm.put(nums2[i],-1);
            }
            st.push(nums2[i]);

       }

       for(int i=0;i<nums1.length;i++){
        if(hm.containsKey(nums1[i])){
            a[i]=hm.get(nums1[i]);
        }
       }
       return a;

    }
}