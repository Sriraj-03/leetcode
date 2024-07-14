public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
// class Solution {
//     int maxLen = 0;
//     int lo = 0;
//     public String longestPalindrome(String s) {
//         char[] input = s.toCharArray();
//         if(s.length() < 2) {
//             return s;
//         }
        
//         for(int i = 0; i<input.length; i++) {
//             expandPalindrome(input, i, i);
//             expandPalindrome(input, i, i+1);
//         }
//         return s.substring(lo, lo+maxLen);
//     }
    
//     public void expandPalindrome(char[] s, int j, int k) {
//         while(j >= 0 && k < s.length && s[j] == s[k]) {
//             j--;
//             k++;
//         }
//         if(maxLen < k - j - 1) {
//             maxLen = k - j - 1;
//             lo = j+1;
//         }
//     }
// }