class Solution
{
    public boolean isHappy(int n)
    {
        int dig = 0, ans = 0 , sq = 0;
        HashSet<Integer> seen = new HashSet<>();
      while(n!=1)
      {
        if(seen.contains(n))
        {
            return false;
        }
        seen.add(n);
        sq = 0;
         while(n>0)
         {
            dig = n%10;
            sq = sq+(dig*dig);
            n=n/10;
         }
         n = sq;
      }
      return true;
    }
}