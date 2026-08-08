class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] map = new int[256]; // support all chars
        int left = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {
            map[s.charAt(right)]++;

            // if duplicate → shrink window
            while (map[s.charAt(right)] > 1) {
                map[s.charAt(left)]--;
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}