ArrayList<int[]> mergedList = new ArrayList<>();

for (int [] x : A) {
	mergedList.add(x);
}

for (int[] x : B) {
	mergedList.add(x);
}

int[][] merged = mergedList.toArray(new int[mergedList.size()][]);

Arrays.sort(merged, (x, y) -> x[0] - y[0]);

ArrayList<int[]> list = new ArrayList<>();

int n = merged.length;

int start = merged[0][0];
int end = merged[0][1];

for (int i = 1; i < n; i++) {
	if (merged[i][0] <= end) {
		end = Math.max(end, merged[i][1]);
	} else {
		list.add(new int[]{start, end});
		start = merged[i][0];
		end = merged[i][1];
	}
}

list.add(new int[]{start, end});

return list.toArray(new int[list.size()][]);
