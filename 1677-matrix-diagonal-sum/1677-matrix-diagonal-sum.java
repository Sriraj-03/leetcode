class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
       
        for(int i=0;i<n;i++){
          
            sum=sum+mat[i][n-1-i];
            
            sum=sum+mat[i][i];

            }
            return (n%2!=0)?(sum-mat[n/2][n/2]):sum;
        }
       

        
    }



// for(int j=0;j<mat[0].length;j++){
            //     if(i==j||i+j==n-1){
            //         if(i==n/2 && j==n/2)
            //             sum=sum+mat[i][j];
                
            //         else
            //         sum=sum+mat[i][j];
            //     }