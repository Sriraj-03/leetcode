class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        else{
            int[] has1= new int[26];
             int[] has2= new int[26];
        for(int i=0;i<s.length();i++){
                has1[s.charAt(i)-'a']++;
                has2[t.charAt(i)-'a']++;
            }
        for(int i=0;i<s.length();i++){
            if(has1[s.charAt(i)-'a']!=has2[s.charAt(i)-'a'])
            return false;
        }
        return true;
        }
        
    }
}