public class Solution {
    public int[] solve(int[] A) {
        int n = A.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans ^= A[i];
        }
        int i = 0;
        while (i < 32) {
            if ((ans & (1<<i)) != 0) {
                break;
            }
            i++;
        }
        int ans1 = 0;
        int ans2 = 0;
        for (int j = 0; j < n; j++) {
            if ((A[j] & (1 << i)) != 0) {
                ans1 ^= A[j];
            } else {
                ans2 ^= A[j];
            }
        }
        if (ans1 < ans2) {
            return new int[]{ans1, ans2};
        } else {
            return new int[]{ans2, ans1};
        }
    }
}
