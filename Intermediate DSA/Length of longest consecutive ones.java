public class Solution {
    public int solve(String A) {
        int n = A.length();
        int count = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '1') {
                count++;
            }
        }
        if (count == n) {
            return n;
        }
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '0') {
                int left = 0;
                int right = 0;
                for (int j = i-1; j >= 0; j--) {
                    if (A.charAt(j) == '1') {
                        left++;
                    } else {
                        break;
                    }
                }
                for (int k = i+1; k < n; k++) {
                    if (A.charAt(k) == '1') {
                        right++;
                    } else {
                        break;
                    }
                }       
                if (count == (left+right)) {
                    ans = Math.max(ans, left+right);
                } else {
                    ans = Math.max(ans, left+right+1);
                }
            }
        }
        return ans;
    }
}
