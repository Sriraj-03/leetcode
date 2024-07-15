class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> has=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        has.add(nums[i]);

        if(nums.length!=has.size())
        return true;
        return false;
    }
}