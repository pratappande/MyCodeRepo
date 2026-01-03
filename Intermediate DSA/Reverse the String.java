public class Solution {
    public String solve(String A) {
        StringBuilder sb = new StringBuilder();

        String[] s = A.trim().split("\\s+");

        int n = s.length;

        for (int i = n-1; i >= 0; i--) {
            sb.append(s[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
