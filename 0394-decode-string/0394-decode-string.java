class Solution {
    int i = 0;

    public String decodeString(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while (i < s.length()) {
            char c = s.charAt(i);
            i++;
            if (Character.isLetter(c)) {
                sb.append(c);
            } else if (Character.isDigit(c)) {
                count = count * 10 + Character.getNumericValue(c);
            } else if (c == ']') {
                break;
            } else if (c == '[') {
                // sub problem
                String repeat = decodeString(s);
                while (count > 0) {
                    sb.append(repeat);
                    count--;
                }
            }
        }
        return sb.toString();
    }
}
// class Solution {
//     int i = 0;
//     public String decodeString(String s) {
//         StringBuilder sb = new StringBuilder();
//         int count = 0;
//         String temp = "";
//         while (i < s.length()) {
//             char c = s.charAt(i);
//             i++;
//             if (c == '[') {
//                 temp = decodeString(s);
//                 int j = 0;
//                 while (j < count) {
//                     sb.append(temp);
//                     j++;
//                 }
//                 count = 0;
//             } else if (c == ']')    break;
//             else if (Character.isAlphabetic(c))    sb.append(c);
//             else    count = count * 10 + c - '0';
//         }
//         return sb.toString();

//     }
// }