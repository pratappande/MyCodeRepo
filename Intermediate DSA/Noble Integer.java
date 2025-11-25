public class Solution {
    public int solve(int[] A) {
        Arrays.sort(A);
        int n = A.length;
        int count = 0;
        int ans = -1;

        for (int i = n-1 ; i >= 0; i--) {
            if (i == n-1 || A[i+1] != A[i]) {
                count = n-i-1;
            }
            if (A[i] == count) {
                ans = 1;
            }
        }
        return ans;
    }
}
