class Solution {
   
            public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    }


// class Solution {
//     public int singleNumber(int[] nums) {
//         for (int i = 0; i < nums.length; i++) {
//             boolean isSingle = true;
//             for (int j = 0; j < nums.length; j++) {
//                 if (i != j && nums[i] == nums[j]) {
//                     isSingle = false;
//                     break;
//                 }
//             }
//             if (isSingle) {
//                 return nums[i];
//             }
//         }
//         return -1; // This line should never be reached if the input is valid
//     }