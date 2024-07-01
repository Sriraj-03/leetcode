class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.length() < minLen) {
                minLen = str.length();
            }
        }

        for (int i = 0; i < minLen; i++) {
            char currentChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != currentChar) {
                    return new String(strs[0].toCharArray(), 0, i);
                }
            }
        }

        return new String(strs[0].toCharArray(), 0, minLen);
    }
}