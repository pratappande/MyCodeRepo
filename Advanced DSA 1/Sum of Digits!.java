public class Solution {
    public int solve(int A) {
        String s = Integer.toString(A);	
        int[] digit = new int[s.length()];
        for (int i = 0; i <s.length() ; i++) {
            digit[i] = s.charAt(i) - '0';
        }
        return arrSum(digit,0);
    }
    public int arrSum(int[] digit, int i) {
        if (i == digit.length-1) {
            return digit[i];
        }
        return digit[i] + arrSum(digit, i+1);
    }
}
