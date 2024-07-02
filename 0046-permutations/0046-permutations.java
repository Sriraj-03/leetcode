import java.util.ArrayList;
import java.util.List;

/**
 * Recursive Backtracking. In this solution passing the index of the nums that
 * needs to be set in the current recursion.
 *
 * Time Complexity: O(N * N!). Number of permutations = P(N,N) = N!. Each
 * permutation takes O(N) to construct
 *
 * T(n) = n*T(n-1) + O(n)
 * T(n-1) = (n-1)*T(n-2) + O(n-1)
 * ...
 * T(2) = (2)*T(1) + O(2)
 * T(1) = O(N) -> To convert the nums array to ArrayList.
 *
 * Above equations can be added together to get:
 * T(n) = n + n*(n-1) + n*(n-1)*(n-2) + ... + (n....2) + (n....1) * n
 *      = P(n,1) + P(n,2) + P(n,3) + ... + P(n,n-1) + n*P(n,n)
 *      = (P(n,1) + ... + P(n,n)) + (n-1)*P(n,n)
 *      = Floor(e*n! - 1) + (n-1)*n!
 *      = O(N * N!)
 *
 * Space Complexity: O(N). Recursion stack.
 *
 * N = Length of input array.
 */
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        permutationsHelper(result, nums, 0);
        return result;
    }

    private void permutationsHelper(List<List<Integer>> result, int[] nums, int start) {
        if (start == nums.length - 1) {
            List<Integer> list = new ArrayList<>();
            for (int n : nums) {
                list.add(n);
            }
            result.add(list);
            return;
        }
        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            permutationsHelper(result, nums, start + 1);
            swap(nums, start, i);
        }
    }

    private void swap(int[] nums, int x, int y) {
        int t = nums[x];
        nums[x] = nums[y];
        nums[y] = t;
    }
}

// import java.util.ArrayList;
// import java.util.List;

// class Solution {
//     public List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>> result = new ArrayList<>();
//         backtrack(result, new ArrayList<>(), nums);
//         return result;
//     }

//     private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
//         if (tempList.size() == nums.length) {
//             result.add(new ArrayList<>(tempList));
//         } else {
//             for (int i = 0; i < nums.length; i++) {
//                 if (tempList.contains(nums[i])) continue; // element already exists, skip
//                 tempList.add(nums[i]);
//                 backtrack(result, tempList, nums);
//                 tempList.remove(tempList.size() - 1); // backtrack
//             }
//         }
//     }
// }


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
