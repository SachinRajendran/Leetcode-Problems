class Solution {
    public String defangIPaddr(String address)
    {
      StringBuffer sb = new StringBuffer(address);
     String res =   sb.toString().replace(".","[.]");
     return res;
    }
}