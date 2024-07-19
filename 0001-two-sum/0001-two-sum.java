class Solution {
    public int[] twoSum(int[] arr, int t) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int com=t-arr[i];
            if(hmap.containsKey(com))
            return new int[]{i,hmap.get(com)};
            else
            hmap.put(arr[i],i);
        }
        return new int[]{};
    }
}

// for (int i = 0; i < n - 1; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (nums[i] + nums[j] == target) {
//                     return new int[]{i, j};
//                 }
//             }
//         }
//         return new int[]{};