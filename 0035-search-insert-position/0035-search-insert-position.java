class Solution {
    public int searchInsert(int[] nums, int tar) {
        int l=0;
        int h=nums.length-1;
        int mid=0;
        
        while(l<=h){
            mid=(l+h)/2;
            if(nums[mid]>tar){
                h=mid-1;
            }
            else if(nums[mid]<tar)
            l=mid+1;
            else if(nums[mid]==tar)
            return mid;
            
           
        }
        return l;
    }
}