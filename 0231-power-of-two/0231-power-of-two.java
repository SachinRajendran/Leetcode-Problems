class Solution
{
    public boolean isPowerOfTwo(int n)
    {
    int res = 1,a=0;  
    if(n==1)
    return true; 
    if(n<=0)
    return false; 
    while(n>2 && a==0)
    {
        // res = res*2;
        // if(res == n)
        // return true;
        a = n%2;
        n = n/2;
    }
    if(a==0)
    return true;
    else
    return false;    
    }
}