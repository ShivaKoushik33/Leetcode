class Solution {
    public void combination(int i,int []candidates,int target,List<List<Integer>>l,List<Integer>p)  
     {
        if(i==candidates.length){
            if(target==0){
                // System.out.println(p.toString());
                l.add(new ArrayList<>(p));
            }
            return ;
        }
        if((candidates[i]<=target)){
            p.add(candidates[i]);
            combination(i,candidates,target-candidates[i],l,p);
            p.remove(p.size()-1);
            

        }
        combination(i+1,candidates,target,l,p);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n=candidates.length;
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> p=new ArrayList<>();
        combination(0,candidates,target,l,p);

    return l;
    }
}