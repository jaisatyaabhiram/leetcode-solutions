class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(p.length()>s.length()){
            return ans;
        }
        int[] scount = new int[26];
        int[] pcount = new int[26];
        for(int i=0; i<p.length(); i++){
            pcount[p.charAt(i)-'a']++;
            scount[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(scount,pcount)){
            ans.add(0);
        }
        for(int i =1; i<=s.length()-p.length();i++){
            scount[s.charAt(i-1)-'a']--;
            scount[s.charAt(i+p.length()-1)-'a']++;
            if(Arrays.equals(scount,pcount)){
                ans.add(i);
            }
        }
        return ans;
        
    }
}