public class Solution {
    public int numSetBits(int A) {
       int ans = 0;
        while (A > 0) {
            if ((A & 1) != 0) {
                ans++;
            }
            A = A >> 1;
        }
        return ans;
    }
}
