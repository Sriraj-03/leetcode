class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> has=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        if(!has.add(nums[i]))
        return true;
        return false;
   }
}