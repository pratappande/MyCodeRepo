int n = A.length;
int m = A[0].length;

int r = 0;
int c = 0;

ArrayList<Integer> list = new ArrayList<>();

while (n > 1 && m > 1) {
	int i = r;
	int j = c;
	
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
	
	r++;
	c++;
	n -= 2;
	m -= 2;
}

if (n == 1) {
	for (int i = r; i < r+n; i++) {
		list.add(A[i][c]);
	}
} else if (m == 1) {
	for (int j = c; j < c+m; j++) {
		list.add(A[r][j]);
	}
}

int[] result = new int[list.size()];

for (int i = 0; i < list.size(); i++) {
	result[i] = list.get(i);
}

return result;
