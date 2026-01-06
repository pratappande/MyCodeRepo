public class Solution {
    public int solve(int A, int B) {
        int n = 0;
        n = n | (1 << A);
        n = n | (1 << B);

        return n;
    }
}
