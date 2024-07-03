class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int k = 1; // Pointer for the position of the next unique element
        int count = 1; // Counter for occurrences of the current element
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            
            if (count <= 2) {
                nums[k] = nums[i];
                k++;
            }
        }
        
        return k;
    }

 }
// public class Main {
//     public static void main(String[] args) {
//         Solution solution = new Solution();
        
//         int[] nums1 = {1, 1, 1, 2, 2, 3};
//         int k1 = solution.removeDuplicates(nums1);
//         System.out.println("Output: " + k1);
//         for (int i = 0; i < k1; i++) {
//             System.out.print(nums1[i] + " ");
//         }
//         System.out.println();
        
//         int[] nums2 = {0, 0, 1, 1, 1, 1, 2, 3, 3};
//         int k2 = solution.removeDuplicates(nums2);
//         System.out.println("Output: " + k2);
//         for (int i = 0; i < k2; i++) {
//             System.out.print(nums2[i] + " ");
//         }
//         System.out.println();
//     }
// }

// class Solution {
//     public int removeDuplicates(int[] nums) {
//         if (nums.length == 0) return 0;
        
//         int k = 1; // Pointer for the position of the next unique element
//         int count = 1; // Counter for occurrences of the current element
        
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] == nums[i - 1]) {
//                 count++;
//             } else {
//                 count = 1;
//             }
            
//             if (count <= 2) {
//                 nums[k] = nums[i];
//                 k++;
//             }
//         }
        
//         return k;
//     }
// }
