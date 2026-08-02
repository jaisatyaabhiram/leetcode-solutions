class Solution {
    public int trap(int[] height) {
        int l =0;
        int r = height.length-1;
        int total =0;
        int lmax = height[0];
        int rmax = height[r];
        while(l<r){
                lmax = Math.max(lmax,height[l]);
                rmax = Math.max(rmax,height[r]);
            if(height[l]<=height[r]){
                    total = total + lmax -height[l];
            
                l++;
            }
            else {
            
                    total = total + rmax - height[r];
                
                r--;
            }
        }
        return total;
    }
}