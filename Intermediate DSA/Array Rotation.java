public class Solution {
    public int[] solve(int[] A, int B) {
        if (A.length <= 1) {
            return A;
        }
        int n = A.length;
        B = B % n;

        for (int i = 0; i < n/2; i++) {
            int temp = A[i];
            A[i] = A[n-1-i];
            A[n-1-i] = temp;
        }

        int w = 0;
        int x = B-1;

        while (w < x) {
            int temp = A[w];
            A[w] = A[x];
            A[x] = temp;
            w++;
            x--;
        }

        int y = B;
        int z = n-1;

        while (y<z) {
            int temp = A[y];
            A[y] = A[z];
            A[z] = temp;
            y++;
            z--;
        }
        return A;
    }
}
