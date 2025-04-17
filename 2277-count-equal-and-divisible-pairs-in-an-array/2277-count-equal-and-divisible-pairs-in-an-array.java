class Solution {
    public int countPairs(int[] nums, int k) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(i!=j &&nums[i]==nums[j]&&((i*j)%k==0)){
                    c++;
                }
            }
        }
        return c;
    }
}