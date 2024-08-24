class Solution
{
    public int[] getConcatenation(int[] nums)
    {
        int n = nums.length;
        int[]ans = new int[n+n];
        int ind,ind1;
        for(ind = 0; ind < nums.length; ind++)
        {
            ans[ind] = nums[ind];
        }
        for(ind = n,ind1 = 0;ind<n+n && ind1<n ;ind++)
        {
            ans[ind] = nums[ind1];
            ind1++;
        }
        return ans;
    }
}