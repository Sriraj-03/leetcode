class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        int l=bins(nums,target,true);
        int r=bins(nums,target,false);
        res[0]=l;
        res[1]=r;
        return res;
    }
    public int bins(int[] nums,int tar,boolean isl){
        int l=0;
        int r=nums.length -1;
        int idx=-1;
        while(l<=r){
            int mid= (l+r)/2;
            if(nums[mid]>tar){
                r=mid-1;
            }
            else if(nums[mid]<tar){
                l=mid+1;
            }
            else{
                idx=mid;
                if(isl)
                    r=mid-1;
                else
                    l=mid+1;
                
            }
        }
        return idx;
    }
}