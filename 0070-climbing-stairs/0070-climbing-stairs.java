class Solution {
    public int climbStairs(int n) {
           if (n == 1) {
	            return 1;
	        }
	        if (n == 2) {
	            return 2;
	        }

	        int[] dp = new int[n + 1];
	        dp[1] = 1;
	        dp[2] = 2;

	        for (int i = 3; i <= n; i++) {
	            dp[i] = dp[i - 1] + dp[i - 2];
	        }

	        return dp[n];
	    //  int[] dp=new int[n+1];
	    // dp[0]=1;
	    // for(int i=1;i<=n;i++){
	    //     for(int j:steps){
	    //         if(i-j>=0){
	    //             dp[i]=dp[i]+dp[i-j];
	    //         }
	    //     }
	    // }
	    // return dp[n];
	    }  
    }
// class Solution {
//     public int climbStairs(int n) {
//         if (n == 0 || n == 1) {
//             return 1;
//         }
//         return climbStairs(n-1) + climbStairs(n-2);
//     }
// }
