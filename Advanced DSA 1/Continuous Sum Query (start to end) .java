int n = A.length;

int m = Q.length;

for (int i = 0; i < m; i++) {
	int index = Q[i][0];
	int value = Q[i][1];
	
	A[index] += value;
}

for (int i = 1; i < n; i++) {
	A[i] += A[i-1];
}

return A;
