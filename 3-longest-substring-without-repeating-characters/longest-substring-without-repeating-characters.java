class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || s ==null){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        HashSet <Character> set = new HashSet<>();
        int left =0,ans =0;
        int curlen=0;
        for(int right=0; right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
                
            }
            ans = Math.max(ans,right-left+1);
            set.add(s.charAt(right));
        }
        return ans;
    }
}