class Solution {
   static char[][] letters = {
        {}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'},
        {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'},
        {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}
    };
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }
        int totalCombinations = 1;
        for (int i = 0; i < digits.length(); i++) {
            totalCombinations *= letters[digits.charAt(i) - '0'].length;
        }
        char[][] combinations = new char[totalCombinations][digits.length()];
        int repeatFactor = totalCombinations;
        for (int i = 0; i < digits.length(); i++) {
            char[] currentLetters = letters[digits.charAt(i) - '0'];
            repeatFactor /= currentLetters.length;
            for (int j = 0; j < totalCombinations; j++) {
                combinations[j][i] = currentLetters[(j / repeatFactor) % currentLetters.length];
            }
        }
        List<String> result = new ArrayList<>();
        for (char[] combination : combinations) {
            result.add(new String(combination));
        }
        return result;
    }
}

// public class LetterCombinations {
//     // Mapping of digits to corresponding letters
//     static char[][] letters = {
//         {}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'},
//         {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'},
//         {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}
//     };

//     public static void main(String[] args) {
//         String digits = "23";
//         char[][] result = letterCombinations(digits);
//         for (char[] combination : result) {
//             System.out.println(new String(combination));
//         }
//     }

//     public static char[][] letterCombinations(String digits) {
//         if (digits.length() == 0) {
//             return new char[0][0];
//         }

//         int totalCombinations = 1;
//         for (int i = 0; i < digits.length(); i++) {
//             totalCombinations *= letters[digits.charAt(i) - '0'].length;
//         }

//         char[][] combinations = new char[totalCombinations][digits.length()];
//         int repeatFactor = totalCombinations;

//         for (int i = 0; i < digits.length(); i++) {
//             char[] currentLetters = letters[digits.charAt(i) - '0'];
//             repeatFactor /= currentLetters.length;
//             for (int j = 0; j < totalCombinations; j++) {
//                 combinations[j][i] = currentLetters[(j / repeatFactor) % currentLetters.length];
//             }
//         }

//         return combinations;
//     }
// }
