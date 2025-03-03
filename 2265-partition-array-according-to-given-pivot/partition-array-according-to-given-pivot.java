class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                l1.add(nums[i]);
            }
            else if(nums[i]==pivot){
                count++;
            }
            else{
                l2.add(nums[i]);
            }
        }
        int j=0;
        for(int i=0;i<l1.size();i++){
            nums[j++]=l1.get(i);
        }
        for(int i=0;i<count;i++){
            nums[j++]=pivot;
        }
        for(int i=0;i<l2.size();i++){
            nums[j++]=l2.get(i);
        }
        return nums;
    }
}