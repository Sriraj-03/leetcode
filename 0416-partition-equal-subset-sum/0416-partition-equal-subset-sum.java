// class Solution {
//     public boolean canPartition(int[] nums) {
//         int totalSum = 0;
//         for (int num : nums) {
//             totalSum += num;
//         }

//         // If the total sum is odd, we cannot partition into equal subsets.
//         if (totalSum % 2 != 0) {
//             return false;
//         }

//         // Check if there exists a subset with sum equal to totalSum/2.
//         return canPartitionHelper(nums, 0, 0, totalSum / 2);
//     }

//     private boolean canPartitionHelper(int[] nums, int index, int currentSum, int targetSum) {
//         if (currentSum == targetSum) {
//             return true; // Found a valid subset.
//         }
//         if (index >= nums.length || currentSum > targetSum) {
//             return false; // Exceeded target sum or reached end of array.
//         }

//         // Include the current number in the subset.
//         if (canPartitionHelper(nums, index + 1, currentSum + nums[index], targetSum)) {
//             return true;
//         }

//         // Exclude the current number from the subset.
//         return canPartitionHelper(nums, index + 1, currentSum, targetSum);
//     }
// }
class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        if (totalSum % 2 != 0) {
            return false;
        }

        int targetSum = totalSum / 2;
        boolean[] dp = new boolean[targetSum + 1];
        dp[0] = true; // Base case: empty subset has sum 0.

        for (int num : nums) {
            for (int sum = targetSum; sum >= num; sum--) {
                dp[sum] |= dp[sum - num];
            }
        }

        return dp[targetSum];
    }
}
