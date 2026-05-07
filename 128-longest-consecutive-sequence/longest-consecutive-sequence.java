class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> numset = new HashSet<>();
        for(int i =0; i<nums.length; i++){
            numset.add(nums[i]);

        }
        int longsubseq = 1;
        for(int num: numset){
            if(numset.contains(num-1)){
                continue;
            }
            else{
                int curnum = num;
                int cursubseq = 1;
                while(numset.contains(curnum+1)){
                    curnum++;
                    cursubseq++;
                }
            
            longsubseq = Math.max(longsubseq,cursubseq);
            }
        }
        return longsubseq;
    }
}