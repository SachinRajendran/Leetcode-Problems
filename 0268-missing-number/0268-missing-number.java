class Solution
{
    public int missingNumber(int[] nums)
    {
       int ind,ans=0;
       Arrays.sort(nums);
       for(ind = 0; ind < nums.length; ind++)
       {
           if(ind+1 != nums[ind])
           ans = ind+1;
       } 
       return ans;
    }
}