/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
    int l=1;
    int h=n;    
    int mid=0;
    int x=-2;
    while(l<=h){
        mid=l+(h-l)/2;
        x=guess(mid);
        if(x==0){
            return mid;
        }
        if(x==-1){
            h=mid-1;
        }
        if(x==1)
        l=mid+1;
    }
    return mid;
    }
}