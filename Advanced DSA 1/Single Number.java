public class Solution {
    public int singleNumber(final int[] A) {

        int ans = 0;
        int n = A.length;
        for (int i = 0; i < n; i++) {
            ans ^= A[i];
        }
        return ans;
    }
}
