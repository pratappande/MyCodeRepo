int n = A.length;
int m = A[0].length;

int i = 0;
int j = m-1;

int index = -1;

while (i < n && j >= 0) {
	if (A[i][j] == 1) {
		index = i;
		j--;
	} else {
		i++;
	}
}

return index;
