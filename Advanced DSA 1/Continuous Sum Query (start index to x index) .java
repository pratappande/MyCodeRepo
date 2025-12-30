int n = A.length;

int m = Q.length;

for (int i = 0; i < m; i++) {
	int startIndex = Q[i][0];
	int endIndex = Q[i][1];
	int value = Q[i][2];
	
	A[startIndex] += value;
	if ((endIndex+1) < n) {
		A[endIndex+1] -= value;
	}
}

for (int i = 1; i < n; i++) {
	A[i] += A[i-1];
}

return A;
