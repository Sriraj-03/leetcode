class Solution {
    public int lengthOfLIS(int[] nums) {
           int n=nums.length;
           int[] dp=new int[n];
           dp[0]=1;
           for(int i=0;i<n;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j])
                dp[i]=Math.max(dp[i],dp[j]+1);
            }
           }
           int maxl=0;
           for(int i:dp)
           maxl=Math.max(maxl,i);

           return maxl;
	    }
    }



// int n = nums.length;
// 	        int[] dp = new int[n];
// 	        dp[0] = 1; // Base case: each element is a valid subsequence of length 1

// 	        for (int i = 1; i < n; i++) {
// 	            dp[i] = 1; // Initialize dp[i] to 1
// 	            for (int j = 0; j < i; j++) {
// 	                if (nums[i] > nums[j]) {
// 	                    dp[i] = Math.max(dp[i], dp[j] + 1);
// 	                }
// 	            }
// 	        }

// 	        // Find the maximum value in dp[]
// 	        int maxLength = 0;
// 	        for (int len : dp) {
// 	            maxLength = Math.max(maxLength, len);
// 	        }

// 	        return maxLength;