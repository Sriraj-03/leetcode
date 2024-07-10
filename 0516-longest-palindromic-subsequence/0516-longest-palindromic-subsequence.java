class Solution {
    public int longestPalindromeSubseq(String s) {
        int i,j,c;
        int n=s.length();
        int[][] l=new int[n][n];
        for(i=0;i<n;i++)
        l[i][i]=1;
        
        for(c=2;c<=n;c++){
            for(i=0;i<n-c+1;i++){
                j=i+c-1;
                if(s.charAt(i)==s.charAt(j)&&c==2)
                l[i][j]=2;
                else if(s.charAt(i)==s.charAt(j))
                l[i][j]=l[i+1][j-1]+2;
                else
                l[i][j]=(l[i][j-1]>l[i+1][j])?l[i][j-1]:l[i+1][j];
            }
        }
        return l[0][n-1];
    }
}