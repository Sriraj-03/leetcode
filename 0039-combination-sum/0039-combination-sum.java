import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
    private void findCombinations(int[] candidates, int target, int start, List<Integer> currentCombination, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                currentCombination.add(candidates[i]);
                findCombinations(candidates, target - candidates[i], i, currentCombination, result);
                currentCombination.remove(currentCombination.size() - 1); // Backtrack
            }
        }
    }
}


// public class CombinationSum {
//     public static void main(String[] args) {
//         int[] candidates = {2, 3, 6, 7};
//         int target = 7;
//         int[][] result = combinationSum(candidates, target);
//         for (int[] combination : result) {
//             if (combination != null) {
//                 for (int num : combination) {
//                     if (num != 0) {
//                         System.out.print(num + " ");
//                     }
//                 }
//                 System.out.println();
//             }
//         }
//     }

//     public static int[][] combinationSum(int[] candidates, int target) {
//         int[][] results = new int[150][target]; // Assuming max 150 combinations
//         int[] currentCombination = new int[target];
//         findCombinations(candidates, target, 0, 0, currentCombination, results);
//         return results;
//     }

//     private static void findCombinations(int[] candidates, int target, int start, int currentIndex, int[] currentCombination, int[][] results) {
//         if (target == 0) {
//             for (int i = 0; i < currentCombination.length; i++) {
//                 results[currentIndex][i] = currentCombination[i];
//             }
//             currentIndex++;
//             return;
//         }

//         for (int i = start; i < candidates.length; i++) {
//             if (candidates[i] <= target) {
//                 currentCombination[currentIndex] = candidates[i];
//                 findCombinations(candidates, target - candidates[i], i, currentIndex + 1, currentCombination, results);
//                 currentCombination[currentIndex] = 0; // Backtrack
//             }
//         }
//     }
// }
