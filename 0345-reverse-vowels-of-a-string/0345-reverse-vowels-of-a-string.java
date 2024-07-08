// class Solution {
//     public String reverseVowels(String s) {
//         char[] a= s.toCharArray();
//         int l=a.length;
//         int c=0;
//         char[] b= new char[l];
//         for(int i=0;i<l;i++){
            
//             if(a[i]=='a'||a[i]=='e'||a[i]=='o'||a[i]=='i'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='O'||a[i]=='I'||a[i]=='U'){
//                     b[c]=a[i];
//                     c++;
//                     a[i]='^';
//             }
//         }
       
//          c=0;
//         for(int i=l-1;i>=0;i--){
//             if(a[i]=='^'){
//                 a[i]=b[c];
//                 c++;
//             }
//         }
//        String se= new String(a);
//        return se;
//     }
// }

class Solution {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            // Find the next vowel from the left.
            while (left < right && !isVowel(a[left])) {
                left++;
            }
            // Find the next vowel from the right.
            while (left < right && !isVowel(a[right])) {
                right--;
            }
            // Swap the vowels.
            if (left < right) {
                char temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }

        return new String(a);
    }

    private boolean isVowel(char ch) {
    // Define the set of vowel characters.
    char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    // Check if the character is in the set of vowels.
    for (char vowel : vowels) {
        if (ch == vowel) {
            return true;
        }
    }
    return false;
}

}
