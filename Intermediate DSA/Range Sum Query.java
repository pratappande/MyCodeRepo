public class Solution {
    public long[] rangeSum(int[] A, int[][] B) {
        int n = A.length;
        int m = B.length;
        long[] Arr = new long[n];
        
        Arr[0] = A[0];
        for (int i = 1; i < n; i++) {
            Arr[i] = Arr[i-1] + A[i];
        }

        long result[] = new long[m];
        for (int i = 0; i < m; i++) {
            int l = B[i][0];
            int r = B[i][1];

            if (l == 0) {
                result[i] = Arr[r];
            } else {
                result[i] = Arr[r] - Arr[l-1]; 
            }
        }
        return result;
    }
}
