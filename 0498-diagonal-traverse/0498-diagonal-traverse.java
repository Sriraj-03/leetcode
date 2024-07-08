class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int index = 0;

        // Traverse diagonals starting from top-left corner
        for (int sum = 0; sum < m + n - 1; sum++) {
            if (sum % 2 == 0) {
                // Traverse upwards
                for (int i = Math.min(sum, m - 1); i >= 0; i--) {
                    int j = sum - i;
                    if (j < n) {
                        result[index++] = mat[i][j];
                    }
                }
            } else {
                // Traverse downwards
                for (int j = Math.min(sum, n - 1); j >= 0; j--) {
                    int i = sum - j;
                    if (i < m) {
                        result[index++] = mat[i][j];
                    }
                }
            }
        }

        return result;
    }
}
