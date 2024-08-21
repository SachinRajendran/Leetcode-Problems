class Solution
{
    public int numJewelsInStones(String jewels, String stones)
    {
    
        int i=0,j=0,count = 0;
          
        for( i=0;i<jewels.length();i++){
            for( j=0;j<stones.length();j++){
                if(jewels.charAt(i)==stones.charAt(j))
                count++;
            }
        }
        //    while(i<jewels.length())
        //    {
        //     if(jewels.charAt(i)==stones.charAt(j))
        //     {
        //        count = count + 1;
        //     }
        //         j++;
        //      if(j==stones.length())
        //     {
        //         i++;
        //         j=0;
        //     }
        //    }
        return count;
    }
}