class Solution {

    public boolean fn(long x, long n, int batteries[]) {
        long total = 0;
        for (int i : batteries) {
            total += Math.min(x, i);
        }
        return total >= n * x;
    }

    public long maxRunTime(int n, int[] batteries) {

        Arrays.sort(batteries);   // ✅ must sort BEFORE computing anything

        long totalSum = 0;
        for (int i : batteries) totalSum += i;

        long low = 0;
        long high = totalSum / n;   // same as your max_possible
        long ans = 0;

        // ✅ Binary search instead of linear scan
        while (low <= high) {
            long mid = (low + high) / 2;

            if (fn(mid, n, batteries)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
