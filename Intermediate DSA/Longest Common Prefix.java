public class Solution {
    public String longestCommonPrefix(String[] A) {
        int n = A.length;

        if (n == 0 || A == null) {
            return "";
        }

        Arrays.sort(A);

        String first = A[0];
        String last = A[n-1];
        int i = 0;

        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0,i);
    }
}
