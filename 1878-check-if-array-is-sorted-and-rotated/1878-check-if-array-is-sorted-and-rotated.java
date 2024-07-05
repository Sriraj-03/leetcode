class Solution {
    public boolean check(int[] nums) {
    int c=0;
    if(nums.length==2)
    return true;
    for(int i=1;i<nums.length;i++){
        if(nums[i-1]>nums[i])
        c++;
    }
    if(nums[0]<nums[nums.length-1])
    c++;
    return c<=1;
    }
}

// int[] arr=new int[nums.length];
//     if(nums.length<=2)
//     return true;
//     for(int i=0;i<nums.length;i++){
//         arr[i]=nums[i];
//     }
    
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length-1;j++){
//                 if(nums[i]>nums[j]){
//                 int temp=nums[j];
//                 nums[j]=nums[i];
//                 nums[i]=temp;
//                 }
//                 if(Arrays.equals(nums,arr))
//                 return true;
//             }
            
            
//         }
        
//         return false;