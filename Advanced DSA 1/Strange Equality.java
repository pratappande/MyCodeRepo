public class Solution {
    public int solve(int A) {
        int bit = 32 - Integer.numberOfLeadingZeros(A);
        int x = ((1<<bit)-1)^A;
        int y = 1<<bit;
        return x^y;
    }
}
