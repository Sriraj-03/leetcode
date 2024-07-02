import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i])) continue; // element already exists, skip
                tempList.add(nums[i]);
                backtrack(result, tempList, nums);
                tempList.remove(tempList.size() - 1); // backtrack
            }
        }
    }
}



// public class Permutations {
//     // Function to swap elements at two positions in the array
//     private static void swap(int[] nums, int i, int j) {
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }

//     // Recursive function to generate permutations
//     private static void generatePermutations(int[] nums, int start, int end) {
//         if (start == end) {
//             // Print the current permutation
//             for (int i = 0; i <= end; i++) {
//                 System.out.print(nums[i] + " ");
//             }
//             System.out.println();
//         } else {
//             for (int i = start; i <= end; i++) {
//                 swap(nums, start, i);
//                 generatePermutations(nums, start + 1, end);
//                 swap(nums, start, i); // backtrack
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] nums = {1, 2, 3}; // Example input
//         generatePermutations(nums, 0, nums.length - 1);
//     }
// }
