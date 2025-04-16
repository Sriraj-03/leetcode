class Solution {
    public int[] twoSum(int[] num, int target) {
        int[] res={-1,-1};
        int n=num.length;
        int i=0,j=n-1;
        while(i<n-1 && j>=0){
            if(num[i]+num[j]==target){
                res[0]=i+1;
                res[1]=j+1;
                return res;
            }
            if(num[i]+num[j]>target)
            j--;
            if(num[i]+num[j]<target)
            i++;
        }
        return res;
        
    }
}