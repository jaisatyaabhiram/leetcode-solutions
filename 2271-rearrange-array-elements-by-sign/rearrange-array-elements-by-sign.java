class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int p =0;
        int n=1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                // swap(nums,i,2*p);
                // p++;
                ans[p]=nums[i];
                p+=2;
            }else{
                // swap(nums,i,2*n+1);
                // n++;
                ans[n]= nums[i];
                n+=2;
            }
            
        }
        return ans;
        
    }
    public void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
}