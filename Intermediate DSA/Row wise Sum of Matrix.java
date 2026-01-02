public class Solution {
    public int[] solve(int[][] A) {
        int n = A.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < A[i].length; j++) {
                sum += A[i][j];
            }
            result[i] = sum;
        }

        return result;
    }
}
