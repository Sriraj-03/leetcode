class Solution {
    public int romanToInt(String s) {
         int[] values = new int[26];
        values['I' - 'A'] = 1;
        values['V' - 'A'] = 5;
        values['X' - 'A'] = 10;
        values['L' - 'A'] = 50;
        values['C' - 'A'] = 100;
        values['D' - 'A'] = 500;
        values['M' - 'A'] = 1000;

        int total = 0; 
        int prevValue = 0; 

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = values[s.charAt(i) - 'A']; 

            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            prevValue = currentValue;
        }

        return total; 
    }
    }


// int[] values = new int[26];
// values[2] = 100;  // 'C'
// values[3] = 500;  // 'D'
// values[8] = 1;    // 'I'
// values[11] = 50;  // 'L'
// values[12] = 1000; // 'M'
// values[21] = 5;   // 'V'
// values[23] = 10;  // 'X'
