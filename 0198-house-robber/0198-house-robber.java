class Solution {
    public int rob(int[] nums) {
       int n=nums.length;
       if(n==1)
       return nums[0];
       int[] dp=new int[n];
       dp[0]=nums[0];
       dp[1]=(nums[0]>nums[1])?nums[0]:nums[1];
       for(int i=2;i<n;i++)
       dp[i]=(dp[i-1]>nums[i]+dp[i-2])?dp[i-1]:nums[i]+dp[i-2];
       return dp[n-1];
    }
}

//  int sum1=0;
//         int sum2=0;
//         for(int i=0;i<nums.length;i=i+2){
//             sum1=sum1+nums[i];
//         }
//         for(int i=1;i<nums.length;i=i+2)
//         sum2=sum2+nums[i];
//         return (sum1>sum2)?sum1:sum2;