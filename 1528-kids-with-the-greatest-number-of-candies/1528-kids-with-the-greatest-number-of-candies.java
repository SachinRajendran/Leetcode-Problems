class Solution
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {
        List<Boolean> res = new ArrayList<>();
        int ind;
         int max = 0;
         for(ind = 0 ; ind<candies.length;ind++)
         {
            max = Math.max(candies[ind],max);
         }
         for(ind = 0;ind<candies.length;ind++)
         {
            if(candies[ind] + extraCandies >= max )
            res.add(true);
            else
            res.add(false);
         }
            return res;     
    }
}