public class Solution {
    public int solve(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        int count = 0;

        for (int i = 0; i < n/2; i++) {
            int temp = A[i];
            A[i] = A[n-i-1];
            A[n-i-1] = temp;
        }

        for (int i = 0; i < n; i++) {
            count += A[i]*(i+1);
        }

        return count;
    }
}
