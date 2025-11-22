public class Solution {
    public long solve(String A) {
        long count = 0;
        long ans = 0;
        int n = A.length();

        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == 'A') {
                count++;
            } else if (A.charAt(i) == 'G') {
                ans += count;
            } 
        }
        return ans;
    }
}
