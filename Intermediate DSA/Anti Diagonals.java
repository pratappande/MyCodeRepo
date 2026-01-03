public class Solution {
    public int[][] diagonal(int[][] A) {
        int n = A.length;
        int m = A[0].length;

        ArrayList<int[]> list = new ArrayList<>();

        for (int j = 0; j < m; j++) {
            ArrayList<Integer> columnList = new ArrayList<>();
            int r = 0;
            int c = j;
            while (r < n && c >= 0) {
                columnList.add(A[r][c]);
                r++;
                c--;
            }
            int[] col = new int[columnList.size()];
            for (int k = 0; k < columnList.size(); k++) {
                col[k] = columnList.get(k);
            }
            list.add(col);
        }

        for (int i = 1; i < n; i++) {
            ArrayList<Integer> rowList = new ArrayList<>();
            int r = i;
            int c = m-1;
            while (r < n && c >= 0) {
                rowList.add(A[r][c]);
                r++;
                c--;
            }
            int[] row = new int[rowList.size()];
            for (int k = 0; k < rowList.size(); k++) {
                row[k] = rowList.get(k);
            }
            
            list.add(row);
        }

        int maxLen = 0;
        for (int[] arr : list) {
            maxLen = Math.max(maxLen, arr.length);
        }
        
        int[][] result = new int[list.size()][maxLen];
        for (int i = 0; i < list.size(); i++) {
            int[] src = list.get(i);
            for (int j = 0; j < src.length; j++) {
                result[i][j] = src[j];
            }
        }

        return result;
    }
}
