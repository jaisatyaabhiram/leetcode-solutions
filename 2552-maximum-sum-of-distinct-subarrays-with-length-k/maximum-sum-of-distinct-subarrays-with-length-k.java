import java.util.*;

class Solution {

    public long maximumSubarraySum(int[] nums, int k) {

        Map<Integer, Integer> subar = new HashMap<>();

        long maxsum = 0;
        long cursum = 0;

        int n = nums.length;

        // ===== BUILD THE FIRST WINDOW =====

        for (int i = 0; i < k; i++) {

            cursum += nums[i];

            // Your code:
            // if(!subar.containsKey(nums[i]))
            //     subar.put(nums[i], 1);
            // else
            //     subar.put(nums[i], subar.get(nums[i]) + 1);

            // Changed to a shorter version
            subar.put(nums[i], subar.getOrDefault(nums[i], 0) + 1);
        }

        // Your code checked every element one by one.
        // Instead, if map size == k, all elements are unique.

        if (subar.size() == k) {
            maxsum = cursum;
        }

        // ===== SLIDING WINDOW =====

        for (int i = k; i < n; i++) {

            // Remove the leftmost element

            int remove = nums[i - k];

            subar.put(remove, subar.get(remove) - 1);

            // Your code:
            // subar.remove(nums[i - 1]);

            // Mistake:
            // You removed the element completely even if it
            // appeared multiple times.

            if (subar.get(remove) == 0) {
                subar.remove(remove);
            }

            cursum -= remove;

            // Add the new element

            int add = nums[i];

            subar.put(add, subar.getOrDefault(add, 0) + 1);

            cursum += add;

            // Your code:

            // for (int j = 0; j < k; j++) {
            //     if (subar.get(nums[j]) == 1)
            //         cursum += nums[j];
            // }

            // Mistake:
            // You were checking the entire window every time.
            // This makes the complexity O(n*k).

            if (subar.size() == k) {
                maxsum = Math.max(maxsum, cursum);
            }
        }

        return maxsum;
    }
}