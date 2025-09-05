import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> numsmap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            numsmap.put(nums[i], numsmap.getOrDefault(nums[i], 0) + 1);
            if (numsmap.get(nums[i]) > (nums.length / 2)) {
                return nums[i];
            }
        }
        return 0;
    }
}
