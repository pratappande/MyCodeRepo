int n = A.length;
int m = A[0].length;

int i = 0;
int j = 0;

ArrayList<Integer> list = new ArrayList<>();

if (n == 1) {
	for (int k = 0; k < m; k++) {
		list.add(A[0][k]);
	}
	int[] result = new int[list.size()];

	for (int i = 0; i < list.size(); i++) {
		result[i] = list.get(i);
	}
	return result;
}

if (m == 1) {
	for (int k = 0; k < n; k++) {
		list.add(A[k][0]);
	}
	int[] result = new int[list.size()];

	for (int i = 0; i < list.size(); i++) {
		result[i] = list.get(i);
	}
	return result;
}

if (n > 1 && m > 1) {
	for (int k = 0; k < m-1; k++) {
		list.add(A[i][j]);
		j++;
	}
	for (int k = 0; k < n-1; k++) {
		list.add(A[i][j]);
		i++;
	}
	for (int k = m-1; k > 0; k--) {
		list.add(A[i][j]);
		j--;
	}
	for (int k = n-1; k > 0; k--) {
		list.add(A[i][j]);
		i--;
	}
}

int[] result = new int[list.size()];

for (int i = 0; i < list.size(); i++) {
	result[i] = list.get(i);
}

return result;
