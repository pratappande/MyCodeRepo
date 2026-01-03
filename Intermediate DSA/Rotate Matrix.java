public class Solution {
    public void solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < m; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        for (int k = 0; k < n; k++) {
            int i = 0;
            int j = m-1;
            while (i < j) {
                int temp = A[k][i];
                A[k][i] = A[k][j];
                A[k][j] = temp;
                i++;
                j--;
            }
        }
    }
}
