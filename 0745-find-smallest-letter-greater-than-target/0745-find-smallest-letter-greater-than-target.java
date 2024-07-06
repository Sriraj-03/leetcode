class Solution {
    public char nextGreatestLetter(char[] le, char t) {
        int l=0;
        int h=le.length-1;
        int mid=0;
        while(l<=h){
            mid=l+(h-l)/2;
            if( le[mid]<=t)
            l=mid+1;
            else
            h=mid-1;
        }
        
        return le[l%le.length];
    }
}