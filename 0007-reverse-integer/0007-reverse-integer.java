class Solution {
    public int reverse(int x) {
        long dig=0,ans=0;
        while(x!=0){
            dig=x%10;
            ans=ans*10+dig;
            x=x/10;
        }
    if((ans>Integer.MAX_VALUE) || (ans<Integer.MIN_VALUE)){
           return 0;
    }
    else{
        return (int) ans;
    }
}
}