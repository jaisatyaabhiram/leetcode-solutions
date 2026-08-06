class Solution {
    public int pivotIndex(int[] nums) {
        int[] res = new int[nums.length];
        res[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            res[i]= res[i-1]+nums[i];
        }
        for(int i=0;i<nums.length; i++){
            if(i==0 && res[nums.length-1]-res[0]==0){
                return 0;
            }
            else if(i==nums.length-1 && res[i-1]==0){
                return nums.length-1;
            }else{
                if(i!=0 && i!=nums.length-1){
                    int leftsum = res[i-1];
                int rightsum = res[nums.length-1]-res[i];
                if(leftsum==rightsum) return i;
                }
            }
            
        }
        return -1;
        
    }
}