public class Solution {
    public int[] solve(int[] A, int[][] B) {
        int n = A.length;
        int m = B.length;

        int[] Arr = new int[n];
        
        Arr[0] = (A[0]%2 == 0) ? 1 : 0;
        
        for (int i = 1; i < n; i++) {
            if (A[i]%2 == 0) {
                Arr[i] = Arr[i-1] + 1;
            } else {
                Arr[i] = Arr[i-1];
            }
        }

        int[] result = new int[m];
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
