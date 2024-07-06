class Solution {
    public int search(int[] nums, int target) {
        int mid;
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            mid=(l+h)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]>target){
                h=mid-1;
            }
            if(nums[mid]<target){
                l=mid+1;
            }
            }
        return -1;
    }
}