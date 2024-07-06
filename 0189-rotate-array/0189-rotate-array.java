class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // Handle cases where k > n

        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
    }
}

// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n = nums.length;
//         k %= n; // Handle cases where k > n

//         // Reverse the entire array
//         reverse(nums, 0, n - 1);
//         // Reverse the first k elements
//         reverse(nums, 0, k - 1);
//         // Reverse the last n - k elements
//         reverse(nums, k, n - 1);
//     }

//     private void reverse(int[] nums, int start, int end) {
//         while (start < end) {
//             int temp = nums[start];
//             nums[start] = nums[end];
//             nums[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }
