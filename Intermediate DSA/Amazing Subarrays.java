public class Solution {
    public int solve(String A) {

        int n = A.length();
        int ans = 0;
        int mod = 10003;

        for (int i = 0; i < n; i++) {
            char ch = Character.toLowerCase(A.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ans = (ans + (n-i)) % mod;
            }
        }
        return ans;
    }
}
