class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s = findbound(nums,target,true);
        if(s == -1){
            return new int[]{-1,-1};
        }
        int e = findbound(nums,target,false);
        return new int[]{s,e};
    }
    public int findbound(int[] nums,int target,boolean isfirst){
        int start =0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                if(isfirst){
                    if(mid==start || nums[mid-1]!=target){
                        return mid;
                    }
                    end=mid-1;
                }else{
                    if(mid==end || nums[mid+1]!=target){
                        return mid;
                    }
                    start =mid+1;
                }
                
            }else if(nums[mid]>target){
                end= mid-1;
            }else{
                start = mid+1;
            }
            
        }
        return -1;
    }
}