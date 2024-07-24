class Solution {
    public int trap(int[] height) {
        Stack <Integer> rightmax=new Stack();
        int leftmax=height[0];
        int n=height.length;
        rightmax.push(height[n-1]);
        for(int i=n-2;i>1;i--){
            rightmax.push(Math.max(rightmax.peek(),height[i]));
        }
        int totwater=0;
        int ans=0;
        for(int i=1;i<n-1;i++)
        {
            int mini=Math.min(leftmax,rightmax.peek());
            totwater=mini-height[i];
            totwater=Math.max(0,totwater);
            ans+=totwater;

            rightmax.pop();
            leftmax=Math.max(leftmax,height[i]);
        }
        return ans;
    }
}
// class Solution {
//     public int trap(int[] height) {
//         int left = 0, right = height.length - 1;
//         int maxLeft = 0, maxRight = 0;
//         int result = 0;

//         while (left < right) {
//             if (height[left] <= height[right]) {
//                 if (height[left] >= maxLeft) {
//                     maxLeft = height[left];
//                 } else {
//                     result += maxLeft - height[left];
//                 }
//                 left++;
//             } else {
//                 if (height[right] >= maxRight) {
//                     maxRight = height[right];
//                 } else {
//                     result += maxRight - height[right];
//                 }
//                 right--;
//             }
//         }
//         return result;
//     }
// }