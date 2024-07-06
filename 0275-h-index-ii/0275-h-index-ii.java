class Solution{
    public int hIndex(int[] c){
        int l=0;
        int r=c.length-1;
        int h=0;
        while(l<=r){
            int mid=(l+r)/2;
            if(c.length-mid<=c[mid]){
                h=c.length-mid;
                r=mid-1;
            }
            else
                l=mid+1;
            
        }
        return h;
    }
    }
 


// class Solution {
//     public int hIndex(int[] c) {
//         int l=1;
//         int h=c.length-1;
//         int mid=0;
//         // if(h==0)
//         // return 0;
//         // if(h==0&& c[0]==1)
//         // return 1;
//         while(l<=h){
//             mid=l+(h-l)/2;
//             if(c[mid]==mid+1)
//             return h-mid+1;
//             else if(mid<c[mid])
//                 h=mid-1;
//             else if(mid>c[mid])
//                 l=mid+1;
//         }
//         return l;
//     }
// }