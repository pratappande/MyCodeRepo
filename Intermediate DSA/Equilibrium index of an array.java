public class Solution {
    public int solve(int[] A) {
        int n = A.length;
        long sum = 0;
        long leftSum = 0;
        int ans = -1;

        for (int i = 0; i < n; i++) {
            sum += A[i];
        }

        for (int i = 0; i < n; i++) {
            long righSum = sum - leftSum - A[i];
            if (leftSum == righSum) {
                ans = i;
            }
            leftSum += A[i];
        }
        return ans;
    }
}
