
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // Traverse from right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse from bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         int i, j, n, m, l = 0, o = 0;
//         Scanner sc = new Scanner(System.in);
//         n = sc.nextInt();
//         m = sc.nextInt();
//         int[][] a = new int[n][m];
//         for (i = 0; i < n; i++) {
//             for (j = 0; j < m; j++) {
//                 a[i][j] = sc.nextInt();
//             }
//         }
//         int p = n, q = m;
//         while (l < p && o < q) {
//             // Traverse from left to right
//             for (i = o; i < q; ++i)
//                 System.out.print(a[l][i] + " ");
//             l++;

//             // Traverse from top to bottom
//             for (i = l; i < p; ++i)
//                 System.out.print(a[i][q - 1] + " ");
//             q--;

//             // Traverse from right to left
//             if (l < p) {
//                 for (i = q - 1; i >= o; --i)
//                     System.out.print(a[p - 1][i] + " ");
//                 p--;
//             }

//             // Traverse from bottom to top
//             if (o < q) {
//                 for (i = p - 1; i >= l; --i)
//                     System.out.print(a[i][o] + " ");
//                 o++;
//             }
//         }
//     }
// }
