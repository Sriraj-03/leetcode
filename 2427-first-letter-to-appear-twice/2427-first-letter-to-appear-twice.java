class Solution {
    public char repeatedCharacter(String s) {
        int [] has=new int[26];
        for(int i=0;i<s.length();i++){
            has[s.charAt(i)-'a']++;
            if( has[s.charAt(i)-'a']==2)
            return s.charAt(i);
        }
     System.gc();
        return 'z';
           
    }
}