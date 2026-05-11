class Solution {
    public int countSubstrings(String s) {
        int ans =0;
        for(int i =0; i<s.length();i++){
            ans += checkpallindrome(s,i,i);
            ans+= checkpallindrome(s,i,i+1);
        }
        return ans;
    }
    public int checkpallindrome(String s,int left, int right){
        int count =0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
            count++;
        }
        return count;
    }
}