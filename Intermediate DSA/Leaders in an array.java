public class Solution {
    public int[] solve(int[] A) {
        int n = A.length;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            boolean isleader = true;
            for (int j = i+1; j < n; j++) {
                if (A[j] >= A[i]) {
                    isleader = false;
                    break;
                }
            }
            if (isleader) {
                list.add(A[i]);
            }
        }
      
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
      
        return result;
    }
}
