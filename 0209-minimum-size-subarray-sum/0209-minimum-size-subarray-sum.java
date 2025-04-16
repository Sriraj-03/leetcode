class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,cs=0;
        int minl=999999;
        for(int r=0;r<nums.length;r++){
            cs+=nums[r];
            while(cs>=target){
                if(r-l+1<minl){
                    minl=r-l+1;
                }
                cs-=nums[l++];
                
            }
        }
        return minl==999999?0:minl;
    }
}


