class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n =nums.length;
        int[] even = new int[(n+1)/2];
        int[] odd = new int[n/2];
        int iE=0;
        int iO =0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                even[iE++] = nums[i];
            }else{
                odd[iO++] = nums[i];
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        iE =0;
        iO =n/2 -1;

        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i] = even[iE++];
            }else{
                nums[i] = odd[iO--];
            }
        }
        return nums;
    }
}