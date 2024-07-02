class Solution {

        public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateCombinations(result, "", n, n);
        return result;
    }
    private void generateCombinations(List<String> result, String current, int open, int close) {
        if (open == 0 && close == 0) {
            result.add(current);
            return;
        }
        if (open > 0) {
            generateCombinations(result, current + "(", open - 1, close);
        }
        if (close > open) {
            generateCombinations(result, current + ")", open, close - 1);
        }
    }
    }


// public class GenerateParentheses {
//     public static void main(String[] args) {
//         int n = 3; // Example input
//         char[][] result = generateParentheses(n);
//         for (char[] combination : result) {
//             System.out.println(new String(combination));
//         }
//     }

//     public static char[][] generateParentheses(int n) {
//         int totalCombinations = calculateTotalCombinations(n);
//         char[][] combinations = new char[totalCombinations][2 * n];
//         generateCombinations(combinations, 0, n, 0, 0, new char[2 * n]);
//         return combinations;
//     }

//     private static int calculateTotalCombinations(int n) {
//         int total = 1;
//         for (int i = 1; i <= n; i++) {
//             total *= (2 * i) * (2 * i - 1) / (i * (i + 1));
//         }
//         return total;
//     }

//     private static void generateCombinations(char[][] combinations, int index, int n, int open, int close, char[] current) {
//         if (open == n && close == n) {
//             for (int i = 0; i < current.length; i++) {
//                 combinations[index][i] = current[i];
//             }
//             return;
//         }

//         if (open < n) {
//             current[open + close] = '(';
//             generateCombinations(combinations, index, n, open + 1, close, current);
//         }

//         if (close < open) {
//             current[open + close] = ')';
//             generateCombinations(combinations, index + 1, n, open, close + 1, current);
//         }
//     }
// }