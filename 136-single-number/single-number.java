class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> check = new ArrayList<>();
        for(int i =0; i<nums.length; i++){
            if(!check.isEmpty()){
                if(check.contains(nums[i])){
                    check.remove(check.indexOf(nums[i]));
                }else{
                    check.add(nums[i]);
                }
            }else{
                check.add(nums[i]);
            }
        }
        return check.get(0);
    }
}