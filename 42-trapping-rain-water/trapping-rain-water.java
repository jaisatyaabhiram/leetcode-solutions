class Solution {
    public int trap(int[] height) {
        int l =0;
        int r = height.length-1;
        int lmax = height[l];
        int rmax = height[r];
        int total =0;
        while(l<r){
            lmax = Math.max(lmax,height[l]);
            rmax = Math.max(rmax,height[r]);
            if(height[l]<=height[r]){
                total+=lmax-height[l];
                l++;
            }else{
                total+=rmax-height[r];
                r--;
            }
        }
        return total;
    }
}