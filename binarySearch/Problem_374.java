/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */
// This is cutom api call of LeetCode . 

// This code will not work anywhere other that LeetCode itself. 
public class Problem_374 extends GuessGame {
    public int guessNumber(int n) {
        int left=1;
        int right=n;
        
        while(left<=right){
            int mid=left+(right-left)/2;
            int num=guess(mid);
            if(num==1) left=mid+1;
            else if(num==-1) right=mid-1;
            else return mid;
        }
        return -1;
    }
}