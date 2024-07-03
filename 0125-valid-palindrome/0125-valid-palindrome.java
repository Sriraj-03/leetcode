class Solution {
    public boolean isPalindrome(String s) {
        String k="";
        if(s.length()==1)
        return true;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z')||(s.charAt(i)>='0'&&s.charAt(i)<='9')){
                k=k+s.charAt(i);
            }
        }
        if(k.isEmpty()==true)
        return true;
       k= k.toLowerCase();
       if(k.length()==1)
       return true;
        System.out.println(k);
        for(int i=0;i<k.length()/2;i++){
            if(k.charAt(i)!=k.charAt(k.length()-i-1))
            return false;
        }
        return true;
    }
}