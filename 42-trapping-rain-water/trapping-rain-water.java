class Solution {
    public int trap(int[] height) {
        int l =0;
        int r = height.length-1;
        int total =0;
        int lmax = height[0];
        int rmax = height[r];
        while(l<r){
            if(height[l]<height[r]){
                lmax = Math.max(lmax,height[l]);
                if(lmax-height[l]>0){
                    total = total + lmax -height[l];
                }
                l++;
            }
            else {
                rmax = Math.max(rmax,height[r]);
                if(rmax-height[r]>0){
                    total = total + rmax - height[r];
                }
                r--;
            }
        }
        return total;
    }
}