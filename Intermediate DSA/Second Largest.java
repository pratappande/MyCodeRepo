public class Solution {
    public int solve(int[] A) {
        int n = A.length;
        int ans = -1;
        
        if (n <= 1) {
            ans = -1;
        }

        Arrays.sort(A);
        for (int i = n-2 ; i >= 0 ; i--) {
            if (A[i] != A[n-1]) {
                ans = A[i];
                break;
            }
        }
        return ans;
    }
}
