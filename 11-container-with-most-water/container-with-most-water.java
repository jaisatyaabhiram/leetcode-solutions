class Solution {
    public int maxArea(int[] height) {
        int l =0; 
        int r = height.length -1;
        int ans =0;
        int area = 0;
        while(l<r){
            int len = Math.min(height[l],height[r]);
            int b = r-l;
            area = len*b;
            ans = Math.max(ans,area);
            if(height[l]>=height[r]){
                r--;
            }else if(height[l]<height[r]){
                l++;
            }
        }
        return ans;
    }
}