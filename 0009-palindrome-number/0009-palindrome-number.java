class Solution {
    public boolean isPalindrome(int x)
    {
        int dig = 0, ans = 0,temp = x;
        while(x>0)
        {
            
            ans = (ans*10)+( x%10 );
            x=x/10;
        }    
        if(ans == temp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}