public class Solution {
    public int solve(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        int d = A[1] - A[0];
        int ans = 1;
        if (n <= 2)
            return 1;
        for (int i = 0; i < n-1; i++) {
            if (d != A[i+1] - A[i]) {
                ans = 0;
                break;
            }
        }
        return ans;
    }
}
