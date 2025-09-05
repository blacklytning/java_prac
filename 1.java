import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numsmap = new HashMap<Integer, Integer>();
        for(int i = 0;i<nums.length;i++) {
            int toFind = target - nums[i];
            if(numsmap.containsKey(toFind)){
                int[] answer = {i, numsmap.get(toFind)};
                return answer;
            }
            numsmap.put(nums[i],i);
        }
        return null;
    }
}

