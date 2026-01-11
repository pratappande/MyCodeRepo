public class Solution {
    public int findMinXor(int[] A) {
        int n = A.length;
        int ans = Integer.MAX_VALUE;
        Arrays.sort(A);
        for (int i = 0; i < n-1; i++) {
            int xor = A[i] ^ A[i+1];
            ans = Math.min(ans,xor);
        }

        return ans;
    }
}
