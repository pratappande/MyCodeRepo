public class Solution {
    public String solve(String A) {
        String str = A + A;
        int n = str.length();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (!Character.isUpperCase(ch)) {
                sb.append(ch);
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                result.append('#');
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
