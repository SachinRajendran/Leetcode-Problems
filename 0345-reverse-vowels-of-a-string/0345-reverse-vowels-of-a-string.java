class Solution
{
    public String reverseVowels(String s)
    {
       char[] ch = s.toCharArray();
       String res = "";
       int left = 0 , right = s.length()-1;
       List<Character> list = List.of('a','e','i','o','u','A','E','I','O','U');
    //    list.add('a');
    //    list.add('e');
    //    list.add('i');
    //    list.add('o');
    //    list.add('u');
       char temp = '0';
       while(left<right)
       {
         if(list.contains(ch[left]) && list.contains(ch[right]))
         {
            temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++; right--;
         }
         else if(!list.contains(ch[left]))
         left++;
         else
         right--;
       }
       for(int i = 0; i < s.length(); i++)
       res += ch[i];
       return res;    
    }
}