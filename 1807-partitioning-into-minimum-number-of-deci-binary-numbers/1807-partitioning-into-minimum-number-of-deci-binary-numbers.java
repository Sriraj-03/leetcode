// class Solution {
//     public int minPartitions(String n) {
//         int m=Integer.MIN_VALUE;
//         for(int i=0;i<n.length();i++){
//             int b= n.charAt(i)-'0';
//             m=(m>b)?m:b;
//         }
//         return m;
        
//     }
// }
class Solution {
    public int minPartitions(String n) {
        for (int i = 9; i >=0; i--) {
            if (n.contains(String.valueOf(i))) return i;
        }
        return 0;
    }
}