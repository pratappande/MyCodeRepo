public class Solution {
    public int[] solve(int[][] A) {
        int m = A[0].length;
        int[] result = new int[m];

        for (int j = 0; j < m; j++) {
            int sum = 0;
            for (int i = 0; i < A.length; i++) {
                sum += A[i][j];
            }
            result[j] = sum;
        }

        return result;
    }
}
