class Solution {
    public String removeOccurrences(String s, String part) {
        if (s.length() < part.length()) {
            return s;
        }
        int n = part.length();
        for (int i = 0; i < s.length(); i++) {
            String prev = "";
            String next = "";
            if (s.length() < part.length()) {
                return s;
            }
            if (i + n > s.length()) {
                return s;
            }
            String curr = customSubstring(s, i, i + n);
            if (customEquals(curr, part)) {
                if (i != 0) {
                    prev = customSubstring(s, 0, i);
                }
                if (i != s.length() - 1) {
                    next = customSubstring(s, i + n, s.length());
                }
                s = prev + next;
                i = -1;
            }
        }
        return s;
    }

    // Custom method to compare substrings
    private boolean customEquals(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Custom method to extract substring
    private String customSubstring(String s, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }
}
// class Solution {
//     public String removeOccurrences(String s, String part) {
//         int len = part.length();
//         while(true) {
//             int idx = s.indexOf(part);

//             if(idx > -1) {
//                 s = s.substring(0, idx) + s.substring(idx + len);
//             } else {
//                 break;
//             }
//         }

//         return s;
//     }
// }