
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        boolean[] used = new boolean[nums.length]; // Track used numbers
        helper(nums, list, list2, used);
        return list;
    }
    
    private void helper(int[] nums, List<List<Integer>> list, List<Integer> list2, boolean[] used) {
        if (list2.size() == nums.length) {
            list.add(new ArrayList<>(list2));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                list2.add(nums[i]);
                helper(nums, list, list2, used);
                list2.remove(list2.size() - 1);
                used[i] = false;
            }
        }
    }
}