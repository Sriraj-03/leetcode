class Solution {
    public List<List<Integer>> combinationSum2(int[] a, int target) {
        Arrays.sort(a);
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, a, new ArrayList<>(), 0, target);
        return ans;
    }

    public void backtrack(List<List<Integer>> ans, int[] a, List<Integer> temp, int start, int remain) {
        if(remain==0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(remain<0){
            return;
        }
        for(int i=start; i<a.length; i++) {
            if(i>start && a[i-1]==a[i]) {
                continue;
            }
            temp.add(a[i]);
            backtrack(ans, a, temp, i+1, remain-a[i]);
            temp.remove(temp.size()-1);
        }
    }
}
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// class Solution {
//     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//         List<List<Integer>> result = new ArrayList<>();
//         Arrays.sort(candidates); // Sort the array to handle duplicates
//         findCombinations(candidates, target, 0, new ArrayList<>(), result);
//         return result;
//     }

//     private void findCombinations(int[] candidates, int target, int start, List<Integer> currentCombination, List<List<Integer>> result) {
//         if (target == 0) {
//             result.add(new ArrayList<>(currentCombination));
//             return;
//         }

//         for (int i = start; i < candidates.length; i++) {
//             if (i > start && candidates[i] == candidates[i - 1]) {
//                 continue; // Skip duplicates
//             }
//             if (candidates[i] <= target) {
//                 currentCombination.add(candidates[i]);
//                 findCombinations(candidates, target - candidates[i], i + 1, currentCombination, result);
//                 currentCombination.remove(currentCombination.size() - 1); // Backtrack
//             }
//         }
//     }
// }


// public class CombinationSum2 {
//     public static void main(String[] args) {
//         int[] candidates = {10, 1, 2, 7, 6, 1, 5};
//         int target = 8;
//         int[][] result = combinationSum2(candidates, target);
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

//     public static int[][] combinationSum2(int[] candidates, int target) {
//         sort(candidates); // Sort the array to handle duplicates
//         int[][] results = new int[150][target]; // Assuming max 150 combinations
//         int[] currentCombination = new int[target];
//         boolean[] used = new boolean[candidates.length];
//         findCombinations(candidates, target, 0, 0, currentCombination, results, used);
//         return results;
//     }

//     private static void findCombinations(int[] candidates, int target, int start, int currentIndex, int[] currentCombination, int[][] results, boolean[] used) {
//         if (target == 0) {
//             for (int i = 0; i < currentCombination.length; i++) {
//                 results[currentIndex][i] = currentCombination[i];
//             }
//             currentIndex++;
//             return;
//         }

//         for (int i = start; i < candidates.length; i++) {
//             if (i > start && candidates[i] == candidates[i - 1] && !used[i - 1]) {
//                 continue; // Skip duplicates
//             }
//             if (candidates[i] <= target) {
//                 currentCombination[currentIndex] = candidates[i];
//                 used[i] = true;
//                 findCombinations(candidates, target - candidates[i], i + 1, currentIndex + 1, currentCombination, results, used);
//                 used[i] = false;
//                 currentCombination[currentIndex] = 0; // Backtrack
//             }
//         }
//     }

//     private static void sort(int[] arr) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = 0; j < arr.length - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }
// }
