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
        int i = s.length() - 1; 
        while (i >= 0) {
            int currentValue = values[s.charAt(i) - 'A']; 

            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            prevValue = currentValue;
            i--; 
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
// class Solution {
//     public int getValue(char ch)
//     {
//         switch(ch)
//         {
//             case 'I': return 1;
//             case 'V': return 5;
//             case 'X': return 10;
//             case 'L': return 50;
//             case 'C': return 100;
//             case 'D': return 500;
//             case 'M': return 1000; 
//             default : return 0;
//         }
//     }

//     public int romanToInt(String s) {
//         int sum=0;
//         int n=s.length();
//         for(int i=0;i<n;i++)
//         {
//            char ch1=s.charAt(i);

//            if((i+1)<n && getValue(ch1)<getValue(s.charAt(i+1)))
//            {
//             sum=sum-getValue(ch1);
//            }
//            else
//            {
//             sum=sum+getValue(ch1);
//            }

//         }

//         return sum;
//     }