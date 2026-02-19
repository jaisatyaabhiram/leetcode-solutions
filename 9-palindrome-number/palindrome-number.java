class Solution {
    public boolean isPalindrome(int x) {
        int rem =0;
        int rev =0;
        int temp = x;
        while(x>0){
            rem = x%10;
            rev = rev*10 + rem;
            x =x/10;
        }
        if(rev==temp){
            return true;
        }
        return false;
    }
}