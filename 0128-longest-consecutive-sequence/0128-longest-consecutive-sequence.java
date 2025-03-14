
       class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int ans = 0 ;
        int len = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] - nums[i+1] == -1){
                len++;
                ans = Math.max(len,ans);
            }else if(nums[i] == nums[i+1]){
                continue;
            }
            else{
                len = 0;
            }
        }
        return ans + 1;
    }
}


// class Solution {
//     public int longestConsecutive(int[] nums) {
//         if (nums.length == 0) {
//             return 0;
//         }
//         // Find the minimum and maximum values in the array
//         int min = nums[0], max = nums[0];
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] < min) {
//                 min = nums[i];
//             }
//             if (nums[i] > max) {
//                 max = nums[i];
//             }
//         }
//         // Create a boolean array to mark the presence of elements
//         int range = max - min + 1;
//         boolean[] present = new boolean[range];
//         for (int i = 0; i < nums.length; i++) {
//             present[nums[i] - min] = true;
//         }
//         // Find the longest consecutive sequence
//         int longestStreak = 0, currentStreak = 0;
//         for (int i = 0; i < range; i++) {
//             if (present[i]) {
//                 currentStreak++;
//                 if (currentStreak > longestStreak) {
//                     longestStreak = currentStreak;
//                 }
//             } else {
//                 currentStreak = 0;
//             }
//         }
//         return longestStreak;
//     }

//     // public static void main(String[] args) {
//     //     Solution solution = new Solution();
//     //     int[] nums1 = {100, 4, 200, 1, 3, 2};
//     //     int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
//     //     System.out.println("Longest consecutive sequence length for nums1: " + solution.longestConsecutive(nums1));
//     //     System.out.println("Longest consecutive sequence length for nums2: " + solution.longestConsecutive(nums2));
//     // }
// }
