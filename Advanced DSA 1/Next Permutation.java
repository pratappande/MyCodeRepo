int n = A.length;

int i = n-2;

while (i >= 0 && A[i] >= A[i+1]) {
	i--;
}

if (i >= 0) {
	int j = n-1;
	
	while (A[j] <= A[i]) {
		j--;
	}
	
	int temp = A[i];
	A[i] = A[j];
	A[j] = temp;
}

int l = i+1;
int r = n-1;

while (l < r) {
	int temp = A[l];
	A[l] = A[r];
	A[r] = temp;
	l++;
	r--;
}

return A;
