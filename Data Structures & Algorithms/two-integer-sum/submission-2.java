class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueIdxMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (valueIdxMap.containsKey(diff)) {
                return new int[]{valueIdxMap.get(diff), i};
            }
            valueIdxMap.put(nums[i], i);
        }
        return null;
    }
}
