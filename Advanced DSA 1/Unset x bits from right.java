public class Solution {
    public long solve(long A, int B) {
        for (int i = 0; i < B; i++) {
            if ((A & (1L << i)) != 0) {
                A = A^(1L << i);
            }
        }

        return A;
    }
}
