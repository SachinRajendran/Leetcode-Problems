class Solution
{
    public int addDigits(int num)
    {
      int dig = 0,ans = 0;
      while(num>=10)
      {
       int res=0;
      while(num>0)
      {
        dig = num%10;
        res = res+dig;
        num=num/10;
      }
     num = res;
      }
      return num;
    }
}