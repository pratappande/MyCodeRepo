public class Solution {
    public int[][] solve(int[] A) {
        int n = A.length;
        
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int[] temp = new int[j-i+1];
                for (int k = i; k <= j; k++) {
                    temp[k-i] = A[k];
                }
                list.add(temp);
            }
        }

        int[][] result = list.toArray(new int[list.size()][]);
        return result;
    }
}
