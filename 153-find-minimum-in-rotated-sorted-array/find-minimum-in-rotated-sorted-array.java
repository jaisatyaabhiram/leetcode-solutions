class Solution {

    public int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        int ans = nums[0];

        while (left <= right) {

            // already sorted
            if (nums[left] < nums[right]) {
                ans = Math.min(ans, nums[left]);
                break;
            }

            int mid = left + (right - left) / 2;

            ans = Math.min(ans, nums[mid]);

            // left half sorted
            if (nums[mid] >= nums[left]) {

                left = mid + 1;

            } else {

                right = mid - 1;
            }
        }

        return ans;
    }
}