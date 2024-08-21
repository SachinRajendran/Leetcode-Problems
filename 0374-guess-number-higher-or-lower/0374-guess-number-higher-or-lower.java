/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n)
    {
          long start = 1;
          long end = n;
          while(start<=end)
          {
            int middle = (int)((end+start)/2);
            if(guess(middle)==-1)
            {
                end = middle-1;
            }
            else if(guess(middle) == 1)
            {
                start = middle+1;
            }
            else
             return middle;
          }  
          return -1;  
    }
}