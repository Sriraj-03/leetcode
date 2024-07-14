class Solution {
    public int removePalindromeSub(String s) {
        if(pali(s)==true)
        return 1;
        else
        return 2;
    }
    public boolean pali(String s){
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    }
