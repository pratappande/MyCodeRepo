int n = A.length;

ArrayList<int[]> list = new ArrayList<>();

int start = A[0][0];
int end = A[0][1];

for (int i = 1; i < n; i++) {
	if (A[i][0] <= end) {
		end = Math.max(end, A[i][1]);
	} else {
		list.add(new int[]{start, end});
		start = A[i][0];
		end = A[i][1];
	}	
}

list.add(new int[]{start, end});

int[][] result = new int[list.size()][2];

for (int i = 0; i < list.size(); i++) {
	result[i] = list.get(i);
}

return result;
