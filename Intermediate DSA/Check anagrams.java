public class Solution {
    public int solve(String A, String B) {
        int n = A.length();
        int m = B.length();
        if (n != m) {
            return 0;
        }
        char[] ch1 = A.trim().toCharArray();
        char[] ch2 = B.trim().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < n; i++) {
            if (ch1[i] != ch2[i]) {
                return 0;
            }
        }
        return 1;
    }
}
