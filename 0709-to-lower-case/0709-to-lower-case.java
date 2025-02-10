class Solution
{
    public String toLowerCase(String s)
    {
       int ind;
       String ans = "";
       for(ind = 0; ind < s.length(); ind++)
       {
        if(s.charAt(ind)>=65 && s.charAt(ind)<=90)
            ans+=(char)(s.charAt(ind)+32);
        else
             ans+=s.charAt(ind);
       }
       return ans;
    }
}