class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;

        int l = nums1.length;
        int end_index = l-1;

        while(m > 0 && n > 0)
        {
            if(nums2[n-1] >= nums1[m-1])
            {
                nums1[end_index] = nums2[n-1];
                n--;
            }
            else
            {
                nums1[end_index] = nums1[m-1];
                m--;
            }
            end_index--;
        }

        while(n > 0)
        {
            nums1[end_index] = nums2[n-1];
            n--;
            end_index--;
        }
    }
}