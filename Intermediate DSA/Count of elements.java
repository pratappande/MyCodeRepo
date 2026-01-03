public class Solution {
    public int solve(int[] A) {
        int n = A.length;
        int sum = 0;
        Arrays.sort(A);

        for (int i = 0; i < n; i++) {
            if (A[i] != A[n-1]) {
                sum++;
            }
        }

        return sum;
    }
}
