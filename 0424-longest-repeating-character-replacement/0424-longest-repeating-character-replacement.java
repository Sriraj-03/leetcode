class Solution {
    public int characterReplacement(String sr, int k) {
            char[] s=sr.toCharArray();
        int len=s.length;
                int[] freq=new int[26];
        int st=0,end=0,max=Integer.MIN_VALUE;
        for(end =0;end<len;end++){
            char ch=s[end];
            freq[s[end]-'A']++;
            max=Math.max(max,freq[s[end]-'A']);
            if(end-st+1-max>k)
            {
                freq[s[st]-'A']--;
                st++;
            }
            
        }
        return (len-st);
    }
}