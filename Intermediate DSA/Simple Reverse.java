public class Solution {
    public String solve(String A) {
        StringBuilder sb = new StringBuilder();
        char[] ch = A.trim().toCharArray();
        int n = ch.length;

        for (int i = n-1; i >= 0; i--) {
            sb.append(ch[i]);
        }

        return sb.toString();
    }
}
