public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += A[i];
        }

        int[] Arr = new int[n];
        Arr[0] = A[0];
        for (int i = 1; i < n; i++) {
            Arr[i] = Arr[i-1] + A[i];
        }

        int[][] range = new int[B+1][2];

        for (int i = 0; i <=B; i++) {
            range[i][0] = i;
            range[i][1] = B-i;
        }
        
        int[] result = new int[range.length];
        for (int i = 0; i < range.length; i++) {
            int l = range[i][0];
            int r = range[i][1];

            if (r == 0) {
                result[i] = Arr[l-1];
            } else if (l == 0) {
                result[i] = Arr[n-1] - (n-r-1 >= 0 ? Arr[n-r-1] : 0);
            } else {
                result[i] = Arr[l-1] + (Arr[n-1] - Arr[n-r-1]);
            }
        }

        int max = result[0];
        for (int x : result) {
            if (x > max) {
                max = x;
            }
        }

        return max;
    }
}
