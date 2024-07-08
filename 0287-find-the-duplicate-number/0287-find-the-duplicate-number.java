class Solution {
    public int findDuplicate(int[] nums) {
        boolean res[]= new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            if(res[nums[i]])
            return nums[i];

            res[nums[i]]=true;
        }
        return 0;
    }
}
// class Solution {
//     public int findDuplicate(int[] nums) {
       
//         int[] hash=new int[100000+1];
//         for(int i=0;i<nums.length;i++){
//                 hash[nums[i]]++;
//                 if(hash[nums[i]]>1){
//                     return nums[i];
//                 }
//         }
//         return 0;
//     }
// }