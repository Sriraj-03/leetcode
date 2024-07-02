class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        if(nums[i]==target)
        return i;
        return -1;
    }
}
// class Solution {
//     public int search(int[] nums, int target) {
//         int left = 0;
//         int right = nums.length - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             if (nums[mid] == target) {
//                 return mid;
//             }

//             // Check if the left half is sorted
//             if (nums[left] <= nums[mid]) {
//                 // Target is in the left half
//                 if (nums[left] <= target && target < nums[mid]) {
//                     right = mid - 1;
//                 } else {
//                     left = mid + 1;
//                 }
//             } else {
//                 // Right half is sorted
//                 // Target is in the right half
//                 if (nums[mid] < target && target <= nums[right]) {
//                     left = mid + 1;
//                 } else {
//                     right = mid - 1;
//                 }
//             }
//         }

//         return -1; // Target not found
//     }
// }