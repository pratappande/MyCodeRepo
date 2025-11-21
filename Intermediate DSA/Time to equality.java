public class Solution {
    public int solve(int[] A) {
    int n = A.length;
    int sec = 0;

    Arrays.sort(A);
    int max = A[n-1];
    for (int i = 0; i < n; i++) {
        if (max != A[i]) {
            sec = sec + (max - A[i]);
        }
    }
    return sec;
    }
}
