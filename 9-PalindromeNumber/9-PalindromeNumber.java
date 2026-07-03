// Last updated: 7/3/2026, 11:29:31 PM
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev = 0;
        int  num= x;

        while (num!= 0) {
            rev= rev*10 + num%10;
            num=num/10;
        }

        return (rev == x);
    }
}