class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        int count = 0;   // number of times max appears in current window
        int left = 0;
        long res = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == max) {
                count++;
            }

            // shrink window until it has at most (k - 1) max elements
            while (count >= k) {
                if (nums[left] == max) {
                    count--;
                }
                left++;
            }

            // all subarrays ending at right and starting from 0 to (left - 1)
            res += left;
        }

        return res;
    }
}
