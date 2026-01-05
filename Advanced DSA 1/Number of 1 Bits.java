public class Solution {
    public int numSetBits(int A) {
        String s = Integer.toBinaryString(A);
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
