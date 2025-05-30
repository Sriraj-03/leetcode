class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
}

// class Solution {
//     public void rotate(int[][] matrix) {
//         int n = matrix.length;
        
//         // Rotate the matrix in a single pass
//         for (int i = 0; i < n / 2; i++) {
//             for (int j = i; j < n - i - 1; j++) {
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[n - j - 1][i];
//                 matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
//                 matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
//                 matrix[j][n - i - 1] = temp;
//             }
//         }
//     }
// }
