// class Solution {
//     public String shortestPalindrome(String str) {
//          if (str == null || str.length() == 0) {
// 	            return "";
// 	        }

// 	        int left = 0;
// 	        int right = str.length() - 1;

// 	        while (left < right) {
// 	            if (str.charAt(left) == str.charAt(right)) {
// 	                left++;
// 	                right--;
// 	            } else {
// 	                str = str.substring(0, left) + str.charAt(right) + str.substring(left);
// 	                right++;
// 	            }
// 	        }

// 	        return str;
//     }
// }
class Solution {
    public String shortestPalindrome(String s) {
        int i=s.length();
        while(i!=1){
            if(isPalindrome(s.substring(0,i))){
                return reverseString(s.substring(i,s.length()))+s;
            }
            i--;
        }
        return reverseString(s.substring(1,s.length()))+s;

    }

    public String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
          sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            char frontChar = str.charAt(i);
            char backChar = str.charAt(len - i - 1);    
            if (frontChar != backChar) {
                return false;
            }
        }
        return true;
    }
}