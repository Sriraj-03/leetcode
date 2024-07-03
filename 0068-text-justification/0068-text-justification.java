import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int index = 0;

        while (index < words.length) {
            int totalChars = words[index].length();
            int last = index + 1;

            while (last < words.length) {
                if (totalChars + 1 + words[last].length() > maxWidth) break;
                totalChars += 1 + words[last].length();
                last++;
            }

            StringBuilder builder = new StringBuilder();
            int diff = last - index - 1;

            // If we're on the last line or the number of words in the line is 1, left-justify
            if (last == words.length || diff == 0) {
                for (int i = index; i < last; i++) {
                    builder.append(words[i]).append(" ");
                }
                builder.deleteCharAt(builder.length() - 1);
                while (builder.length() < maxWidth) {
                    builder.append(" ");
                }
            } else {
                int spaces = (maxWidth - totalChars) / diff;
                int extraSpaces = (maxWidth - totalChars) % diff;

                for (int i = index; i < last; i++) {
                    builder.append(words[i]);
                    if (i < last - 1) {
                        for (int j = 0; j <= (spaces + (i - index < extraSpaces ? 1 : 0)); j++) {
                            builder.append(" ");
                        }
                    }
                }
            }
            result.add(builder.toString());
            index = last;
        }

        return result;
    }
}

// public class Main {
//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         String[] words1 = {"This", "is", "an", "example", "of", "text", "justification."};
//         int maxWidth1 = 16;
//         String[] result1 = solution.fullJustify(words1, maxWidth1);
//         printResult(result1);

//         String[] words2 = {"What", "must", "be", "acknowledgment", "shall", "be"};
//         int maxWidth2 = 16;
//         String[] result2 = solution.fullJustify(words2, maxWidth2);
//         printResult(result2);

//         String[] words3 = {"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"};
//         int maxWidth3 = 20;
//         String[] result3 = solution.fullJustify(words3, maxWidth3);
//         printResult(result3);
//     }

//     private static void printResult(String[] result) {
//         for (String line : result) {
//             System.out.println("\"" + line + "\"");
//         }
//         System.out.println();
//     }
// }

// class Solution {
//     public String[] fullJustify(String[] words, int maxWidth) {
//         String[] result = new String[words.length];
//         int index = 0;
//         int resultIndex = 0;

//         while (index < words.length) {
//             int totalChars = words[index].length();
//             int last = index + 1;

//             while (last < words.length) {
//                 if (totalChars + 1 + words[last].length() > maxWidth) break;
//                 totalChars += 1 + words[last].length();
//                 last++;
//             }

//             char[] line = new char[maxWidth];
//             for (int i = 0; i < maxWidth; i++) {
//                 line[i] = ' ';
//             }

//             int diff = last - index - 1;

//             if (last == words.length || diff == 0) {
//                 int i = 0;
//                 for (int j = index; j < last; j++) {
//                     for (char c : words[j].toCharArray()) {
//                         line[i++] = c;
//                     }
//                     if (i < maxWidth) {
//                         line[i++] = ' ';
//                     }
//                 }
//             } else {
//                 int spaces = (maxWidth - totalChars) / diff;
//                 int extraSpaces = (maxWidth - totalChars) % diff;

//                 int i = 0;
//                 for (int j = index; j < last; j++) {
//                     for (char c : words[j].toCharArray()) {
//                         line[i++] = c;
//                     }
//                     if (j < last - 1) {
//                         for (int k = 0; k <= (spaces + (j - index < extraSpaces ? 1 : 0)); k++) {
//                             line[i++] = ' ';
//                         }
//                     }
//                 }
//             }

//             result[resultIndex++] = new String(line);
//             index = last;
//         }

//         String[] finalResult = new String[resultIndex];
//         for (int i = 0; i < resultIndex; i++) {
//             finalResult[i] = result[i];
//         }

//         return finalResult;
//     }
// }