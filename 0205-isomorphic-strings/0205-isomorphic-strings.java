class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (mapS[sChar] == 0) {
                mapS[sChar] = tChar;
            } else if (mapS[sChar] != tChar) {
                return false;
            }

            if (mapT[tChar] == 0) {
                mapT[tChar] = sChar;
            } else if (mapT[tChar] != sChar) {
                return false;
            }
        }

        return true;
    }
}
