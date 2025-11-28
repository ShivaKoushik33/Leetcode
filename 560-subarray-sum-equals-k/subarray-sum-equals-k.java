class Solution {
    public int subarraySum(int[] nums, int k) {
        int l=0;
        int r=0;
        int count=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        int prefix[]=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=nums[i]+prefix[i-1];
        }
        hm.put(0,1);
        for(int i=0;i<n;i++){
            int temp=prefix[i]-k;
            if(hm.containsKey(temp)){
                count+=hm.get(temp);
            }
            hm.put(prefix[i],hm.getOrDefault(prefix[i],0)+1);
        }
        return count;
    }
}