import java.util.Stack;

class Solution {
    public int sumSubarrayMins(int[] arr) {
        int MOD = 1_000_000_007;
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ple = new int[n]; // Previous Less Element index
        int[] nle = new int[n]; // Next Less Element index
        long count = 0;

        // Compute PLE (Previous Less Element index)
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            ple[i] = st.isEmpty() ? -1 : st.peek(); // Store index, not arr value
            st.push(i);
        }

        st.clear();

        // Compute NLE (Next Less Element index)
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nle[i] = st.isEmpty() ? n : st.peek(); // Store index, not arr value
            st.push(i);
        }

        // Calculate the sum of minimums
        for (int i = 0; i < n; i++) {
            long left = i - ple[i];   // Contribution from the left side
            long right = nle[i] - i;  // Contribution from the right side
            count = (count + (arr[i] * left % MOD) * right % MOD) % MOD; // Take modulo in steps
        }

        return (int) count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {11, 81, 94, 43, 3};
        System.out.println(sol.sumSubarrayMins(arr)); // Expected Output: 444
    }
}
