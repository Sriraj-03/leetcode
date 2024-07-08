class Solution {
    public boolean wordPattern(String pattern, String s) {
         String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        String[] mapChar = new String[26];
        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            if (mapChar[c - 'a'] == null) {
                mapChar[c - 'a'] = words[i];
            } else if (!mapChar[c - 'a'].equals(words[i])) {
                return false;
            }
        }

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j]) && pattern.charAt(i) != pattern.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }
}
// class Solution {
//     public boolean wordPattern(String pattern, String s) {
//         String[] words = s.split(" ");
//         if (pattern.length() != words.length) {
//             return false; // Different lengths, so cannot match.
//         }

//         // Arrays to store the mapping between pattern characters and words.
//         String[] patternToWord = new String[26]; // Assuming only lowercase English letters.
//         boolean[] usedWords = new boolean[words.length];

//         for (int i = 0; i < pattern.length(); i++) {
//             char ch = pattern.charAt(i);
//             int index = ch - 'a'; // Convert character to array index.

//             if (patternToWord[index] == null) {
//                 // If this pattern character is not mapped yet, map it to the current word.
//                 patternToWord[index] = words[i];
//                 if (usedWords[i]) {
//                     return false; // Word already used, so inconsistent mapping.
//                 }
//                 usedWords[i] = true;
//             } else {
//                 // Check if the existing mapping matches the current word.
//                 if (!patternToWord[index].equals(words[i])) {
//                     return false; // Inconsistent mapping.
//                 }
//             }
//         }

//         return true;
//     }
// }
