class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,cs=0;
        int minl=Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++){
            cs=cs+nums[r];
            while(cs>=target){
                if(r-l+1<minl){
                    minl=r-l+1;
                }
                cs=cs-nums[l];
                l++;
            }
        }
        return minl==Integer.MAX_VALUE?0:minl;
    }
}


