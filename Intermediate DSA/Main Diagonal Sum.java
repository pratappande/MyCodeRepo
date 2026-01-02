public class Solution {
    public int solve(final int[][] A) {
        int n = A.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i][i];
        }
        return sum;
    }
}
