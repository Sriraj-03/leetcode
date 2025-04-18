class Solution {
    public int maxProfit(int[] a) {
        int least = Integer.MAX_VALUE;
        int max = 0 ;
        for(int i = 0 ; i<a.length; i++)
        {
            int profit = a[i]-least;
            if(profit>=0)
            {
                max = (profit > max)? profit : max;
            }
            else
            {
                least = a[i];
            }
        }
        return max;
        // int n=prices.length;
        // if(n==1)
        // return 0;
        // int cur=prices[0];
        // int p=0;
        // for(int i=1;i<n;i++){
        //     if(cur>prices[i]){
        //         cur=prices[i];
        //     }
        //     else if(p<prices[i]-cur){
        //         p=prices[i]-cur;}
        // }
        // return p;



           }
}







//  int n=prices.length;
//         int cur=prices[0];
//         int max=Integer.MIN_VALUE;
//         int profit=0;
//         for(int i=1;i<n;i++){
//         if(cur>prices[i])
//         cur=prices[i];
//         else if((prices[i]-cur)>profit){
//             profit=prices[i]-cur;
//         }
//         }
//         return profit;
