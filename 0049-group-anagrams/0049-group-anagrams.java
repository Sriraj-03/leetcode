class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            
            map.get(sortedWord).add(word);
        }
        
        return new ArrayList<>(map.values());
    }
}

// public class Main {
//     public static void main(String[] args) {
//         String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
//         String[][] result1 = groupAnagrams(strs1);
//         printResult(result1);

//         String[] strs2 = {""};
//         String[][] result2 = groupAnagrams(strs2);
//         printResult(result2);

//         String[] strs3 = {"a"};
//         String[][] result3 = groupAnagrams(strs3);
//         printResult(result3);
//     }

//     public static String[][] groupAnagrams(String[] strs) {
//         int n = strs.length;
//         boolean[] visited = new boolean[n];
//         int groupCount = 0;

//         // Count the number of groups
//         for (int i = 0; i < n; i++) {
//             if (!visited[i]) {
//                 groupCount++;
//                 for (int j = i + 1; j < n; j++) {
//                     if (isAnagram(strs[i], strs[j])) {
//                         visited[j] = true;
//                     }
//                 }
//             }
//         }

//         // Create the result array
//         String[][] result = new String[groupCount][];
//         visited = new boolean[n];
//         int groupIndex = 0;

//         for (int i = 0; i < n; i++) {
//             if (!visited[i]) {
//                 int groupSize = 1;
//                 for (int j = i + 1; j < n; j++) {
//                     if (isAnagram(strs[i], strs[j])) {
//                         groupSize++;
//                     }
//                 }

//                 result[groupIndex] = new String[groupSize];
//                 result[groupIndex][0] = strs[i];
//                 int index = 1;
//                 visited[i] = true;

//                 for (int j = i + 1; j < n; j++) {
//                     if (isAnagram(strs[i], strs[j])) {
//                         result[groupIndex][index++] = strs[j];
//                         visited[j] = true;
//                     }
//                 }

//                 groupIndex++;
//             }
//         }

//         return result;
//     }

//     public static boolean isAnagram(String s1, String s2) {
//         if (s1.length() != s2.length()) {
//             return false;
//         }

//         int[] count = new int[26];
//         for (int i = 0; i < s1.length(); i++) {
//             count[s1.charAt(i) - 'a']++;
//             count[s2.charAt(i) - 'a']--;
//         }

//         for (int i = 0; i < 26; i++) {
//             if (count[i] != 0) {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void printResult(String[][] result) {
//         for (String[] group : result) {
//             System.out.print("[");
//             for (int i = 0; i < group.length; i++) {
//                 System.out.print(group[i]);
//                 if (i < group.length - 1) {
//                     System.out.print(", ");
//                 }
//             }
//             System.out.println("]");
//         }
//     }
// }
