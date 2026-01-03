public class Solution {
    public int colorful(int A) {
        String str = String.valueOf(A);
        int n = str.length();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int value = 1;
            for (int j = i; j < n; j++) {
                value *= (str.charAt(j) - '0');
                if (set.contains(value)) {
                    return 0;
                }		
                set.add(value);
            }
        }
        return 1;
    }
}
