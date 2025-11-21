public class Solution {
    public int solve(int[] A, int B) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == B ) {
                sum++;
            }
        }
        return sum;
    }
}
