public class Solution {
    public int solve(final int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int sum = 0;
        int i = 0;
        int j = m-1;

        while (i < n && j >= 0) {
            sum += A[i][j];
            i++;
            j--;
        }
        return sum ;
    }
}
