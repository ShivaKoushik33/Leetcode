class Solution {
     public int rec(int i,int nums[],List<Integer> l,int target){
            if(i==nums.length){
                int sum=0;
                for(int x:l){
                    sum=sum|x;
                }
                if(sum==target){
                    return 1;
                }
                else{
                    return 0;
                }
            }
            l.add(nums[i]);
            int a=rec(i+1,nums,l,target);
            l.remove(l.size()-1);
            int b=rec(i+1,nums,l,target);
            return a+b;
     }

    public int countMaxOrSubsets(int[] nums) {
        int sum=0;
       for(int i=0;i<nums.length;i++){
        sum=sum | nums[i];
       } 
       List<Integer> l=new ArrayList<>();
       

       return rec(0,nums,l,sum);
    }
}