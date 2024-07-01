class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Find the minimum length string in the array
        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.length() < minLen) {
                minLen = str.length();
            }
        }

        // Compare characters one by one
        for (int i = 0; i < minLen; i++) {
            char currentChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != currentChar) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0].substring(0, minLen);
    }
}