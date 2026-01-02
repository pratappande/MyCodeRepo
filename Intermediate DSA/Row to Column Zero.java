public class Solution {
    public int[][] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;

        for (int i = 0; i < n; i++) {
            boolean isZero = false;
            for (int j = 0; j < m; j++) {
                if (A[i][j] == 0) {
                    isZero = true;
                }
            }
            if (isZero) {
                for (int j = 0; j < m; j++) {
                    if (A[i][j] != 0) {
                        A[i][j] = -1;
                    }
                }
            }
        }
        for (int j = 0; j < m; j++) {
            boolean isZero = false;
            for (int i = 0; i < n; i++) {
                if (A[i][j] == 0) {
                    isZero = true;
                }
            }
            if (isZero) {
                for (int i = 0; i < n; i++) {
                    if (A[i][j] != 0) {
                        A[i][j] = -1;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] == -1) {
                    A[i][j] = 0;
                }
            }
        }
        return A;
    }
}
