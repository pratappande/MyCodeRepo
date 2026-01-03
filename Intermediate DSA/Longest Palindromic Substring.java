public class Solution {
    public String longestPalindrome(String A) {
        int n = A.length();
        String str = "";

        for (int i = 0; i < n; i++) {
            String even = longestelement(A,i,i+1);
            String odd = longestelement(A,i,i);
            
            if (str.length() < even.length()) {
                str = even;
            }
            if (str.length() < odd.length()) {
                str = odd;
            }
        }
        return str;
    }

    public String longestelement(String A, int start, int end) {
        int n = A.length();
        while (start >= 0 && end < n && A.charAt(start) == A.charAt(end)) {
            start--;
            end++;
        }
        return A.substring(start+1,end);
    }
}
