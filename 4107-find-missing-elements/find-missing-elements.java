class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        // int count=1;
        // for(int i=1; i<nums.length; i++){

        //     if(count!=nums[i]){
        //         ans.add(i);
                
        //     }
        //     count++;
        // }
        for(int i=1; i<nums.length;i++){
            int val = nums[i-1]+1;
            while(nums[i]!=val){
                ans.add(val);
                val++;
            }
        }
        return ans;
    }
}