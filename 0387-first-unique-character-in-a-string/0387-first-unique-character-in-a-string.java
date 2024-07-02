class Solution {
    public int firstUniqChar(String s) {
        int[] has=new int[26];
        for(int i=0;i<s.length();i++)
         has[s.charAt(i)-'a']++;

        for(int i=0;i<s.length();i++)
        if(has[s.charAt(i)-'a']==1)
        return i;

        return -1;
    }
}