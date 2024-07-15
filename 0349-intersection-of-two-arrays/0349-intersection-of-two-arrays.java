import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> has=new HashSet<>();
        HashSet<Integer> dup=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        has.add(nums1[i]);
         for(int i=0;i<nums2.length;i++)
         if(has.contains(nums2[i]))
         dup.add(nums2[i]);
        int i=0;
        int []arr=new int[dup.size()];
        for(int ele:dup)
        arr[i++]=ele;
        // dup.toArray(arr);


        return arr;

    

    }
}