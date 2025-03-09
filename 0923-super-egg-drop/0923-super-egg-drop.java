class Solution {
    Integer dp[][] =new Integer [101][10001];
    public int superEggDrop(int k, int n) {
        if(k==1)
        return n;
        if(n==0 || n==1)
            return n;
        if(dp[k][n]!=null)
            return dp[k][n];
            int i,l=1,h=n;
            int ans=Integer.MAX_VALUE;
            while(l<=h){
                int mid=(l+h)/2;
                int dt=superEggDrop(k-1,mid-1);
                int ut=superEggDrop(k,n-mid);
                int t=1+Math.max(dt,ut);
                if(dt<ut)
                l=mid+1;
                else
                h=mid-1;
                ans=Math.min(t,ans);
            }
            dp[k][n]=ans;
            return ans;
        }
    }
