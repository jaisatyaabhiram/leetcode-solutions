class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> count = countnums(nums);
        Map.Entry<Integer,Integer> majority = null;
        for(Map.Entry<Integer,Integer> entry:count.entrySet()){
            if (majority == null || entry.getValue() > majority.getValue()) {
                majority = entry;
            }
        }
        return majority.getKey();
    }
    Map<Integer,Integer> countnums(int[] nums){
        Map<Integer,Integer> count = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!count.containsKey(nums[i])){
                count.put(nums[i],1);
            }else{
                count.put(nums[i],count.get(nums[i])+1);
            }
        }
        return count;
    }
}