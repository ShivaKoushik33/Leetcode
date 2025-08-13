class Solution {
     static HashMap<String,Integer> hm=new HashMap<>();
    public static void sub(int i,int arr[], ArrayList<Integer> l,List<List<Integer>> ans){
        if(i==arr.length){
            // Collections.sort(l);
            String s="";
            for(int x:l){
                s=s+x;
            }
            // System.out.println(s);
            if(!hm.containsKey(s)){
                hm.put(s,1);
                ans.add(new ArrayList<>(l));
            }
            return ;
        }
        
        l.add(arr[i]);
        sub(i+1,arr,l,ans);
        l.remove(l.size()-1);
        sub(i+1,arr,l,ans);

    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
         ArrayList<Integer> l=new ArrayList<>();
         List<List<Integer>> ans=new ArrayList<>();
         hm.clear();
         Arrays.sort(nums);
        
         
        sub(0,nums,l,ans);
        return ans;
    }
}