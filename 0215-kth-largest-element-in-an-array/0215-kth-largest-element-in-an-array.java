class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minq=new PriorityQueue<>();
        for(int i:nums){
            minq.add(i);
            if(minq.size()>k)
            minq.remove();
        }
        return minq.peek();
    }
}