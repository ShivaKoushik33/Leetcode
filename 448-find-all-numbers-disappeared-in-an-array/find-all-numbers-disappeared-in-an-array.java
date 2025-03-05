class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> x=new ArrayList<>();
        int dup[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            dup[i]=-1;
        }
        for(int i=0;i<nums.length;i++){
         
                dup[nums[i]-1]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(dup[i]==-1){
                x.add(i+1);
            }
        }
        return x;
    }
}