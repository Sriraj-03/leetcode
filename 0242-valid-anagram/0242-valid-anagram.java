class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        else{
            int[] has1= new int[26];
             
        for(int i=0;i<s.length();i++){
                has1[s.charAt(i)-'a']++;
                has1[t.charAt(i)-'a']--;
            }
        for(int i=0;i<s.length();i++){
            if(has1[s.charAt(i)-'a']!=0)
            return false;
        }
        return true;
        }
        
    }
}

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length()!=t.length()) return false;
//         char[]x=s.toCharArray();
//         char[]y=t.toCharArray();
//         Arrays.sort(x);
//         Arrays.sort(y);
//         for(int i=0;i<x.length;i++){
//             if(x[i]!=y[i]) return false;
//         }

//   return true;  }
// }