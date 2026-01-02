public class Solution {
    public int[] plusOne(int[] A) {
        int n = A.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (A[i] == 0) {
                count++;
            } else {
                break;
            }
        }

        if (count == n) {
            return new int[]{1};
        }

        int[] x = new int[n-count];
        int m = x.length;

        for (int i = 0; i < m; i++) {
            x[i] = A[i+count];
        }

        int i = m-1;
        while (i >= 0 && x[i] == 9) {
            x[i] = 0;
            i--;
        }

        if (i >= 0) {
            x[i]++;
            return x;
        }

        int[] result = new int[m+1];
        result[0] = 1;

        return result;
    }
}
