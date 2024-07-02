class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array to handle duplicates
        boolean[] used = new boolean[nums.length];
        backtrack(result, new ArrayList<>(), nums, used);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, boolean[] used) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) continue; // Skip duplicates
                used[i] = true;
                tempList.add(nums[i]);
                backtrack(result, tempList, nums, used);
                used[i] = false;
                tempList.remove(tempList.size() - 1); // Backtrack
            }
        }
    }
}

// class Solution {
//     public List<List<Integer>> permuteUnique(int[] nums) {
//       Set<List<Integer>>ans=new HashSet<>();
//         List<Integer>res=new ArrayList<>();
        
//       boolean arr[]=new boolean[nums.length];
     
//         Permu(nums,arr,ans,res,0);
//         return new ArrayList<>(ans);
    
    

//     }
//     public static void Permu(int[]nums,boolean arr[], Set<List<Integer>>ans,List<Integer>res,int idx){
// if(idx==nums.length){
//     ans.add(new ArrayList<>(res));
//     return;
// }


// for(int i=0;i<nums.length;i++){
//     if(arr[i]==false){
//     res.add(nums[i]);
//     arr[i]=true;
    
//     Permu(nums,arr,ans,res,idx+1);
//     res.remove(res.size()-1);
//     arr[i]=false;
   
//     }
//  }


// }
 

//     }