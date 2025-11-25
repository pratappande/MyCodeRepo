public class Solution {
    public long solve(int[] A, int B) {

        int n = A.length;
        long ans = 0;
        long sum = 0;

        for (int i = 0; i < B; i++) {
            sum += A[i];
        }

        ans = sum;

        int i = 1;
        int j = B;
        while (j < n) {
            sum = sum - A[i-1] + A[j];
            ans = Math.max(ans,sum);
            i++;
            j++;
        }

        return ans;
    }
}
