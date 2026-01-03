public class Solution {
    public int solve(String A) {
        int n = A.length();
        int count = 0;

        for (int i = 0; i < n-2 ; i++) {
            char ch = A.charAt(i);
            char ch1 = A.charAt(i+1);
            char ch2 = A.charAt(i+2);
            if (ch == 'b' && ch1 == 'o' && ch2 == 'b') {
                count++;
            }
        }
        return count;
    }
}
