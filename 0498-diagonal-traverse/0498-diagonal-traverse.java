class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat.length < 0) 
            return new int[] {};
        int m = mat.length;
        int n = mat[0].length;
        int[] dag = new int[m * n];
        int i = 0;
        int j = 0;
        int max = m * n;
        int count = 0;
        boolean dir = true;
        while (count < dag.length) {
            if (dir) {
                while (i >= 0 && j < n) {
                    dag[count++] = mat[i][j];
                    i--;
                    j++;
                }
                i++;
                if (j >= n) { 
                    j = n - 1;
                    i++;
                }
            } else {
                while (i < m && j >= 0) {
                    dag[count++] = mat[i][j];
                    i++;
                    j--;
                }
                j++;
                if (i >= m) {
                    i = m - 1;
                    j++;
                }
            }
            dir = !dir;
        }
        return dag;
    }
}
// class Solution { 
//     private int mIndex;
//     private int nIndex;
//     private int index;
    
//     public int[] findDiagonalOrder(int[][] mat) {
//         int m = mat.length;
//         int n = mat[0].length;
//         int[] arr = new int[m*n];
        
//         if(m == 1){
//             return mat[0];
//         }
//         if(n == 1){
//             for(int i = 0; i < m; i++){
//                 arr[i] = mat[i][0];
//             }
//             return arr;
//         }
        
//         mIndex = 0;
//         nIndex = 0;
//         index = 0;
//         while(index < arr.length - 1){
//             traverseForward(mat, m , n, arr);
//             traverseBack(mat, m, n, arr);
//         }
//         arr[index] = mat[m - 1][n - 1];
//         return arr;
//     }
    
//     public void traverseForward(int[][] mat, int m, int n, int[] arr){
//         while(mIndex > -1 && nIndex < n && index < arr.length - 1){
//             arr[index++] = mat[mIndex--][nIndex++];
//         }
//         if(nIndex == n){
//             mIndex += 2;
//             nIndex--;
//         }
//         else if(mIndex == -1){
//             mIndex++;
//         }
//     }
    
//     public void traverseBack(int[][] mat, int m, int n, int[] arr){
//         while(mIndex < m && nIndex > -1 && index < arr.length - 1){
//             arr[index++] = mat[mIndex++][nIndex--];
//         }
//         if(mIndex == m){
//             nIndex += 2;
//             mIndex--;
//         }
//         else if(nIndex == -1){
//             nIndex++;
//         }
//     }
// }

// class Solution {
//     public int[] findDiagonalOrder(int[][] mat) {
//         int m = mat.length;
//         int n = mat[0].length;
//         int[] result = new int[m * n];
//         int index = 0;

//         // Traverse diagonals starting from top-left corner
//         for (int sum = 0; sum < m + n - 1; sum++) {
//             if (sum % 2 == 0) {
//                 // Traverse upwards
//                 for (int i = Math.min(sum, m - 1); i >= 0; i--) {
//                     int j = sum - i;
//                     if (j < n) {
//                         result[index++] = mat[i][j];
//                     }
//                 }
//             } else {
//                 // Traverse downwards
//                 for (int j = Math.min(sum, n - 1); j >= 0; j--) {
//                     int i = sum - j;
//                     if (i < m) {
//                         result[index++] = mat[i][j];
//                     }
//                 }
//             }
//         }

//         return result;
//     }
// }
