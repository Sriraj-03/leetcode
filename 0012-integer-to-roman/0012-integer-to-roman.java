class Solution {
    public String intToRoman(int num) {
      
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder roman = new StringBuilder();
        
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }
        return roman.toString();
    }
    }
//  public static String intToRoman(int num) {
//         // Define the values and symbols for Roman numerals
//         int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
//         String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
//         // Initialize the result string
//         char[] result = new char[15]; // Maximum length of Roman numeral for 3999 is 15
//         int index = 0;
        
//         // Loop through each value and symbol
//         for (int i = 0; i < values.length; i++) {
//             // Append the symbol while the value can be subtracted from num
//             while (num >= values[i]) {
//                 for (char c : symbols[i].toCharArray()) {
//                     result[index++] = c;
//                 }
//                 num -= values[i];
//             }
//         }
        
//         // Convert the char array to a string
//         return new String(result, 0, index);
//     }
