class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            int req=target-curr;
            if(hm.containsKey(req)){
                return new int[]{i,hm.get(req)};
            }
            hm.put(nums[i],i);
        }
        return null;
        
    }
}