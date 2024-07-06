// class Solution{
//     public int passThePillow(int n,int time)
//     {

//     }
// }

class Solution {
    public int passThePillow(int n, int time) {
        int cnt=1,dem=n;
        while(time>0){
                if(cnt==n)
                cnt=-n;
                if(cnt==-1)
                cnt=1;
                cnt++;
            time--;
        }
        return Math.abs(cnt);
    }
}

// // class Solution {
// //     public int passThePillow(int n, int time) {
// //         int cnt=1,dem=n;;
// //         while(time>0){
// //                 if(time==1){
// //                     return Math.abs(cnt);
// //                 }
// //                 cnt++;
// //                 if(cnt==n)
// //                 cnt=-cnt;
               
// //                 if(cnt==0)
// //                 cnt=1;
                
// //             time--;
// //         }
// //         return -1;
// //     }
// // }
