class Solution {
    public int numTrees(int n) {
        // Array to store the number of unique BSTs for each count of nodes
        int[] catalan = new int[n + 1];
        
        // Base cases
        catalan[0] = 1;
        catalan[1] = 1;
        // Fill the array using the recursive formula
        for (int i = 2; i <= n; i++) {
            catalan[i] = 0;
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j] * catalan[i - j - 1];
            }
        }
        
        return catalan[n];
    }
}


// class Solution {
//     public int numTrees(int n) {
//         // Array to store the number of unique BSTs for each count of nodes
//         int[] dp = new int[n + 1];
        
//         // Base cases
//         dp[0] = 1;
//         dp[1] = 1;
        
//         // Fill the array using the recursive formula
//         for (int i = 2; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 dp[i] += dp[j - 1] * dp[i - j];
//             }
//         }
        
//         return dp[n];
//     }

//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         int n = 3; // Example input
//         System.out.println("Number of structurally unique BSTs with " + n + " nodes: " + solution.numTrees(n));
//     }
// }
