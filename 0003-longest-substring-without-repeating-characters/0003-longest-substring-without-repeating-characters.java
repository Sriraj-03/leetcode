import java.util.HashSet;

public class Solution {
    // public int lengthOfLongestSubstring(String s) {
    //     HashSet<Character> set = new HashSet<>();
    //     int longest = 0, i = 0, j = 0;
        
    //     while (j < s.length()) {
    //         if (!set.contains(s.charAt(j))) {
    //             set.add(s.charAt(j));
    //             j++;
    //             longest = Math.max(longest, set.size());
    //         } else {
    //             set.remove(s.charAt(i));
    //             i++;
    //         }
    //     }
        
    //     return longest;
    // }

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;

        boolean[] seen = new boolean[256]; // Assuming ASCII characters
        int longest = 0, i = 0, j = 0;

        while (j < s.length()) {
            if (!seen[s.charAt(j)]) {
                seen[s.charAt(j)] = true;
                j++;
                longest = Math.max(longest, j - i);
            } else {
                seen[s.charAt(i)] = false;
                i++;
            }
        }

        return longest;
    }

}
